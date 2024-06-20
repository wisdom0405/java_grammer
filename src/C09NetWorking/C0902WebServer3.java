package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0902WebServer3 {
    public static void main(String[] args) throws IOException, SQLException {
        // 소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념이다.
        // IOException이 예상되므로 throws/try-catch 해줘야한다. (예외처리 강제:checked execption)
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");

        // http://localhost:8081/?name=hong
        while(true) {
            // accept() : 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                sb.append(line + "\n");
            }

            String requestString = sb.toString();
            System.out.println(requestString);

            // 웹에서 http://localhost:8081/?name=hong 으로 접속했을 때
            // 'requestString'출력내용 중 GET /?name=hong HTTP/1.1 에서 이름(hong) 자르기
            String firstLine = requestString.split("\n")[0]; // GET /?name=hong HTTP/1.1
            String infos = firstLine.split(" ")[1]; // /?name=hong
            Integer id = 0;
            String name = "";
            String email = "";

            if(infos.contains("?")) { // infos에 ?가 있으면
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for(String s : stArr){
                    String[] keyValue = s.split("=");
                    if(keyValue[0].equals("id")){
                       id = Integer.parseInt(keyValue[1]);
                    }
                    if(keyValue[0].equals("name")){
                        name = keyValue[1];
                    }
                    if(keyValue[0].equals("email")){
                        email = keyValue[1];
                    }
                }
            }

            // SQL workbench 연결 포트번호 : 3306
            // mysql 드라이버가 필요
            String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // useSSL : 보안처리
            String userName = "root";
            String password = "1234";

            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("DB 연결 성공");

            // statement : 쿼리를 담아 db로 쿼리 전달하는 객체
            Statement st = con.createStatement();
            String myQuery = "SELECT * FROM post";

            if(id != null && id.intValue() != 0){
                myQuery = "SELECT * FROM post WHERE id = " + id;
            }

            if(name != null && !name.isEmpty()) {
                myQuery = "SELECT * FROM post WHERE name = '" + name + "'";
            }

            ResultSet rs = st.executeQuery(myQuery);
            String title = "";
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                // password = rs.getInt("password");
                System.out.println("id는 " + id + " title 은 " + title);
            }


            System.out.println("id : " + id); // id : 1
            // 화면에 동적으로 id 화면 출력
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world" +id;
            // UTF-8 문자열 return
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            // flush란 일반적으로 변경사항을 확정(반영)하는 것을 의미
            socket.getOutputStream().flush();
            // http://localhost:8081
            socket.close();
        }
    }
}
