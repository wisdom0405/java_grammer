package C01Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class C08List {
    public static void main(String[] args) {
        // List 선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
//        // 가장 일반적인 List 선언방법
//        // 왼쪽엔 인터페이스, 오른쪽엔 구현체(클래스)
//        List<String> myList3 = new ArrayList<>();
//        // 선언만 있고 실제구현은 ArrayList에서 구현하고 있다.
//
//        // 초기값 생성방법 1.
//        myList3.add("java");
//        myList3.add("C++");
//        myList3.add("python");
//
//        // 초기값 생성방법 2. 리스트를 주입하는 방식
//        // Arrays.asList는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java", "C++", "python"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> myList6 = new ArrayList<>(List.of(myArr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();
//        for(int i : intArr){
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList); // [10, 20]
//
//        // add(index, 값) : 중간에 값 삽입
//        myList.add(0, 30); // 중간에 값 삽입하면 줄줄이 밀려나가서 성능 떨어짐
//        System.out.println(myList); // [30, 10, 20]
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
//        // 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        // get : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0)); // 30
//
//        // for문을 돌려 전체 list 출력
//        // size() : 리스트의 길이(개수) 반환
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
//        // remove : 요소삭제
//        // 1) index를 통한 삭제 2) value를 통한 삭제
//        System.out.println(myList); // [30, 10, 20, 1, 2]
//        myList.remove(0);
//        System.out.println(myList); // [10, 20, 1, 2]
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        // set(index, value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size() - 1, 10);
//        System.out.println(myList); // [10, 20, 10]
//
//        // indexOf : 특정 값이 몇번 째 index에 위치한지 return
//        // 가장 먼저 나오는 값의 index return
//        System.out.println(myList.indexOf(10)); // 0
//
        // 전체삭제 : clear()
        // isEmpty : 값이 비었는지, 안 비었는지
        List<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(10);

        // contains : 특정 값이 있는지 없는지 확인
        System.out.println(list.contains(20)); // false
    }
}
