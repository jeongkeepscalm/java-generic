package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        System.out.println("deque = " + deque);     // deque = [2, 1]
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println("deque = " + deque);     // deque = [2, 1, 3, 4]


        // 데이터를 꺼내지 않고 단순 조회
        System.out.println("deque.peekFirst() = " + deque.peekFirst()); // 2
        System.out.println("deque.peekFirst() = " + deque.peekLast());  // 4

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 2
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 1
        System.out.println("deque.pollLast() = " + deque.pollLast());   // 4
        System.out.println("deque.pollLast() = " + deque.pollLast());   // 3

        System.out.println("deque = " + deque);                         // []

    }

}
