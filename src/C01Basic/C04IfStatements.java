package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

        // 도어락 키 if문
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(answer == input){
//            // 참일 경우 실행문;
//            System.out.println("문이 열렸습니다.");
//        }else{
//            //거짓일 경우 실행문;
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

        // 알파벳이 소문자인지 대문자인지 판별하는 프로그램
        // 소문자 1글자 입력 시 소문자입니다.
        // 대문자 1글자 입력 시 대문자입니다.
        // 그 외 문자 입력 시 알파벳이 아닙니다.

//        Scanner sc = new Scanner(System.in);
//        char ch1 = sc.nextLine().charAt(0);
//
//        if (ch1 >= 'a' && ch1 <= 'z') {
//            System.out.println("소문자 입니다.");
//        } else if (ch1 >= 'A' && ch1 <= 'Z') {
//            System.out.println("대문자 입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }
        // 택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
        // 사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
        // if문 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면,
        // 모든 if문이 중복되어 실행될 가능성이 존재.
        Scanner sc = new Scanner(System.in);
        System.out.println("얼마있는지 말해보소");
        int input = sc.nextInt();
        if(input >= 10000){
            System.out.println("당신은 부자군요.. 택시 타십시오");
     } else if (input >= 3000) {
            System.out.println("당신은 서민이군요.. 버스 타십시오");
        }else if(input >= 2000){
            System.out.println("킥보드를 타세요");
        }else{
            System.out.println("걍 걸으세요..");
        }
        }
    }
