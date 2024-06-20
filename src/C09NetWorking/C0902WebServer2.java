package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0902WebServer2 {
    public static void main(String[] args) throws IOException {
        // 소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념이다.
        // IOException이 예상되므로 throws/try-catch 해줘야한다. (예외처리 강제:checked execption)
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");
        // http://localhost:8081/?name=jeongseulki
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
            //GET /?name=jeongseulki HTTP/1.1 에서 이름 자르기
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if(infos.contains("?")) {
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for(String s : stArr){
                    String[] keyValue = s.split("=");
                    if(keyValue[0].equals("id")){
                       id = keyValue[1];
                    }
//                    if(keyValue[0].equals("name")){}
                }
            }
            System.out.println("id : " + id); // id : 1

            // 화면에 동적으로 id 화면 출력
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world" + id;
            // UTF-8 문자열 return
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            // flush란 일반적으로 변경사항을 확정(반영)하는 것을 의미
            socket.getOutputStream().flush();
            // http://localhost:8081
            socket.close();
        }
    }
}
