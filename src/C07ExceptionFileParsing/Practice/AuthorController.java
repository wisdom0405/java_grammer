package C07ExceptionFileParsing.Practice;
import java.util.*;
//2.Author컨트롤러
// 2-1.회원가입 : name, email, password 입력
// -> service의 register 메서드 호출 -> service에서 Author객체 생성
// -> repository에서 register완료
// 2-1.회원가입 예외처리 => service에서는 throw new 발생, controller try catch구조.
// (동일한 email 있는경우, 비밀번호가 5자리 이하인경우)
// 2-2.로그인 : email, password 입력 -> service의 login메서드 호출
// -> service에서 해당 user가 있는지 검증 및 비밀번호 일치여부 검증

import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        // AuthorService의 객체 생성
        AuthorService authorService = new AuthorService();

        System.out.println("원하시는 서비스를 입력해주세요\n 1. 회원가입 \n 2.로그인");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        while(true){
            if(choice ==1){
                // 1. 회원가입 선택
                System.out.println("1. 회원가입"); // 이름, 이메일, 패스워드 입력
                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요(중복이메일 불가)");
                String email = sc.nextLine();
                System.out.println("패스워드를 입력해주세요(6자리 이상)");
                String password = sc.nextLine();

                try{
                    // AuthorService의 register 메서드 호출해서 Author객체 만들기
                    authorService.register(name, email, password);
                }
            }
        }


    }
}
