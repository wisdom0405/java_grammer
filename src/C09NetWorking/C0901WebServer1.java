package C09NetWorking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0901WebServer1 {
    public static void main(String[] args) throws IOException {
        // 소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념이다.
        // IOException이 예상되므로 throws/try-catch 해줘야한다. (예외처리 강제:checked execption)
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");
        while(true) {
            // accept() : 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
            // localhost:8081
            // \r :  개행문자
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
            // UTF-8 문자열 return
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            // flush란 일반적으로 변경사항을 확정(반영)하는 것을 의미
            socket.getOutputStream().flush();
            // http://localhost:8081
            socket.close();
        }
    }
}
