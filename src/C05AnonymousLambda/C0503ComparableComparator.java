package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
        // Comparable 인터페이스에는 compareTo메서드 선언
        // Comparator 인터페이스에는 compare메서드 선언

        // String 클래스 안에 CompareTo 내장(Comparable 구현, 오버라이딩된 것)
        // String 클래스 외에 java 많은 내장 클래스에서 Comparable 구현
//        String a = "hello";
//        String b = "horld";
        // 두 문자열의 각 자리를 순차적으로 비교
        // 문자열의 비교는 유니코드값의 차이를 반환하는 것
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));// 0

//        List<String> myList = new ArrayList<String>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList); // Comparable의 compareTo메서드를 구현하여 정렬
//        System.out.println(myList); // [java, javascript, python]
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList); // [python, javascript, java]
//
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 24));
        students.add(new Student("lee", 21));
        students.add(new Student("park", 35));
        students.add(new Student("choi", 15));
        students.add(new Student("kim", 30));

//        // 방법1. Student 객체에서 Comparable을 구현 => compareTo메서드를 오버라이딩
//        Collections.sort(students);
//        for (Student s : students) {
//            System.out.println("이름 : "+ s.getName() + "나이 : "+ s.getAge());
//        }
//        //    choi 15
//        //    lee 21
//        //    kim 24
//        //    kim 30
//        //    park 35

        // 방법2. Comparator를 구현한 익명객체를 sort에 주입
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 오름차순
            }
        };
//        for (Student s : students) {
//            System.out.println("이름 : "+ s.getName() + "나이 : "+ s.getAge());
//        }
        System.out.println(students);
        students.sort(myComparator); // Comparator 구현체를 필요로 한다.

        // 람다표현식으로 표현
        Comparator<Student> myComparator2 = (a,b) -> a.getAge() - b.getAge();
        students.sort(myComparator2);
        students.sort((a,b) -> a.getAge() - b.getAge());
        students.sort((a,b) -> a.getName().compareTo(b.getName()));

//        students.sort(Comparator.reverseOrder());

        // 실습 : 아래 문자열을 글자길이 순서로 내림차순 정렬하여라
        String[] stArr = {"hello", "java", "C++", "world2"};
        Arrays.sort(stArr, Comparator.reverseOrder());
        Arrays.sort(stArr, (a,b)-> b.length() - a.length()); // 글자길이 내림차 순 (길이 비교)
        System.out.println(Arrays.toString(stArr)); // [world2, hello, java, C++]

        // [4,5], [1,2], [5,0], [3,1]
        // 위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째 요소를 기준으로 내림차순 배열 정렬
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});

        myList.sort((a,b) -> b[1] - a[1]); // 내림차순이므로 b[1] - a[1]

        for (int[] a : myList) {
            System.out.println(Arrays.toString(a));
        }
    }
}

//class Student implements Comparable<Student> { // 어떤 객체를 Compare할건지 <>안에 표기
class Student  {
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 모든 클래스의 조상클래스인 Object 클래스의 toString 메서드를 Overriding 하여
    // 객체 호출시에 자동으로 toString메서드 호출
    @Override
    public String toString() {
        return "이름 : " + this.name + ", 나이 : " +this.age;
    }

//
//    @Override
//    public int compareTo(Student s) {
////        return this.name.compareTo(s.getName());
////        return s.getName().compareTo(this.name);
////        return s.getAge() - this.age; // 내림차 순
//        return this.age - s.getAge(); // 오름차순
//    }
}