package C01Basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        // 배열 표현식 1 : 리터럴 방식
//        int[] intArr1 = {1, 2, 3, 4, 5};
//
//        // 배열 표현식 2 : 선언 후 할당방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); // 0으로 초기화
//        for(int i=0; i<intArr2.length; i++){
//            System.out.println(intArr2[i]);
//        }
//        for(int i : intArr2){
//            System.out.println(i); // 원본 값에 들어가서 변경 못함
//   }
//
////        String[] charArr = new String[10];
////        System.out.println(charArr[0]);
//
//        // 표현식 3
//        int[] intArr3 = new int[]{1, 2, 3, 4};
//        // test(new int[]{1, 2, 3, 4}); //로도 할당가능
//
//        // 표현식 4 : 불가 -> 배열의 길이는 사전이 지정되어야 함.
//        int[] intArr4 = new int[];
//        String[] stArr1 = new String[5];
//        stArr1[0] = "hello";
//        stArr1[1] = "java";
//        // null pointer exception : 값을 할당안하면 null로 들어감 -> null을 대상으로 메서드를 사용하면 예외발생
//        System.out.println(stArr1[2].length());
//
//        String[] stArr2 = new String[5];
//        // 배열에 값 한꺼번에 세팅
//        Arrays.fill(stArr2, "java");
//        System.out.println(stArr2[3]);

//    // 85, 65, 90인 int 배열을 선언하고, 총합, 평균을 구해보자
//    int[] arr = {85, 65, 90};
//    int sum = 0;
////    int[] arr = new int[]{85, 65, 90} 도 사용가능 (통째로 매개변수로 넘겨주는 경우에 사용. 대부분 사용X)
//    for(int i=0; i< arr.length; i++){
//        sum += arr[i];
//    }
//    int n = arr.length;
//    int average = sum/arr.length;
//

//        // 최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0]; // Integer.MIN_VALUE로도 세팅가능
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("최대값은"+max+"입니다");
//
//        int min = arr[0]; // Integer.MAX_VALUE로도 세팅가능
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("최소값은"+min+"입니다.");

        // 동적으로 배열의 순서 바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//         int[] arr2 = {10, 20, 30, 40, 50};
//         // 0번째 index부터 마지막 index까지 순차적으로 자리 change
//        // 20, 30, 40, 50, 10으로 결과 반환
//        for (int i = 0; i < arr2.length-1; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        // 배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        // 새로운 배열에 위 arr을 뒤집은 값 세팅
//        int[] newArr = new int[arr.length];
//        int num = arr.length - 1;
//        for (int i = 0; i < arr.length; i++) {
//            newArr[num-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

        // 내 코드
//        int n = arr.length;
//        int[] arr2 = new int[5];
//        for(int i = n-1; i >= 0; i--){
//            arr[i-n] = arr2[i];
//        }
//        System.out.println(Arrays.toString(arr2));

        // 숫자 뒤집기
        // int num = 1234;
        // 문자열과 관련된 풀이로 풀기
        // 4321이 문자열로 출력되도록
        // 문자열 -> 문자배열로 만들고 -> 문자열로 합해서 문자열로 출력

//        // 내 코드
//        int num = 1234;
//        String num2 = Integer.toString(num);
//        StringBuffer answer = new StringBuffer();
//        for(int i = num2.length()-1; i>=0; i--){
//            answer.append(num2.charAt(i));
//        }
//        System.out.println(answer);

//        // 강사님 코드
//        int num = 1234;
//        String stNum = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int count = stNum.length()-1;
//        for(int i = 0; i<stNum.length(); i++){
//            sb.append(stNum.charAt(count-i));
//        }
//
//        // 정렬 : 메서드(사전기능구현) -> 선택정렬, 버블정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr); // 오름차순 정렬이 기본
//        System.out.println(Arrays.toString(arr));

//        // 문자정렬
//        // 아스키코드 기준으로 정렬이 되므로 대문자가 소문자보다 아스키 코드 숫자가 낮다.
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//
//        // 내림차순
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder()); // 오름차순 정렬
//
        // 기본형 타입은 Comparator로 처리 불가
        int[] intArr = {5, 1, 2, 7, 3, 1, 2};
        //Arrays.sort(intArr, Comparator.reverseOrder()); // Comparator : 기본형X, 참조형만 처리가능
        Arrays.sort(intArr);// 방법1 : 오름차순 정렬 후 배열 뒤집기

//        // 방법2. streamapi, lambda를 활용한 내림차순 정렬
//         int[] answer = Arrays.stream(intArr); //intArr를 대상으로 Stream 객체
//                        .boxed() // int 요소를 Integer로 형변환 시키는 메서드
//                        .sorted(Comparator.reverseOrder())
//                        .mapToInt(a->a) // Integer를 int로 형변환
//                        .toArray(); // 배열로 변환




    }
}
