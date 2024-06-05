package C01Basic;

public class C06String {
    public static void main(String[] args) {
        // 참조자료형 : 기본 자료형을 제외한 모든 자료형
        // WrapperClass : 기본형 타입을 Wrapping한 클래스
        // int와 Integer간의 형변환
        int a = 10;
        Integer b = new Integer(20);
        // 오토 언박싱 : Integer-> int 형변환
        int c = b;
        // 오토 박싱
        Integer d = a;

        // String과 int의 형변환
        int a = 10;
        // int -> String
        String st1 = Integer.toString(a);
        String st2 = String.valueOf(a);
        // String -> int
        int b = Integer.parseInt(st1);

        // 참조자료형에 원시자료형을 담을 때는 Wrapper클래스를 써야 한다.
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        // String 변수 생성방법
        // 객체 생성 -> 이게 룰이지만
//        String st1 = new String("hello");
        // 리터럴 방식 -> 이걸 더 추천
//        String st2 = "hello";
//
//        Integer a = 10;
//        int a1
    }
}
