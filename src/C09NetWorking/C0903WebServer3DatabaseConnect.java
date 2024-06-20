package C09NetWorking;

import java.sql.*;

public class C0903WebServer3DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        // SQL workbench 연결 포트번호 : 3306
        // mysql 드라이버가 필요
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // useSSL : 보안처리
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");

        // statement : 쿼리를 담아 db로 쿼리 전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT name,email,password FROM author WHERE name = 'hong' AND email = 'hong@naver.com'";
        ResultSet rs = st.executeQuery(myQuery);

        String name = "";
        String email = "";
        int authorPassword = 0;
        while (rs.next()) {
            name = rs.getString("name");
            email = rs.getString("email");
            authorPassword = rs.getInt("password");
            System.out.println("이름 : "+name+" 이메일 : "+email+" 비밀번호 : "+authorPassword);
        }
    }
}
