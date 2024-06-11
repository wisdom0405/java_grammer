package C01Basic;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        //Queue -> Deque -> LinkedList
//        Queue<Integer> myQue = new LinkedList<Integer>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); //10
//        System.out.println(myQue);//[10, 20, 30]
//        System.out.println(myQue.poll()); //10 (아예 꺼내고 return)
//        System.out.println(myQue); // [20, 30]

//        // LinkedList와 ArrayList 비교
//        // LinkedList의 add
        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedList의 중간삽입 : " +(endTime - startTime)); //277
//
//        // ArrayList의 add
        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간삽입 : " +(endTime2 - startTime2)); // 261047

//        // LinkedList와 ArrayList 비교
//        // LinkedList의 조회
//
//        long startTime3 = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedList의 조회 : " +(endTime3 - startTime3));
//
//        // ArrayList의 add
//        long startTime4 = System.currentTimeMillis(); // 밀리초 까지 숫자값으로 변환
//        for(int i = 0; i < 10000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 조회 : " +(endTime4 - startTime4));

        Queue<String> myQue = new LinkedList<>();
        myQue.add("문서1");
        myQue.add("문서2");
        myQue.add("문서3");
        while (!myQue.isEmpty()) {
            System.out.println(myQue.poll());
        }
        // ArrayBlockQueue : 길이제한 있는 큐
        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        // add를 사용하면 길이제한 초과시 예외 발생
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40");
//        System.out.println(queue);

        queue.offer("10");
        queue.offer("20");
        queue.offer("30");
        queue.offer("40");
        System.out.println(queue);

        // 우선순위 큐 : 데이터를 꺼낼 때 정렬된 데이터 pop
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); //O(NlogN)
        }
        // pq하나 poll할 때마다 O(logN)
        // 프로그래머스 : 더 맵게
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int count = 0;

        while (Arrays.stream(scoville).min().getAsInt() < k ){
             Arrays.sort(scoville);
             scoville[1] = scoville[0] + 2 * scoville[1];
             scoville = scoville.
             count++;
        }

    }
}
