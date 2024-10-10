package collection.deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
//        Queue<Integer> queue = new LinkedList<>();

        // add data
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);                 // 1, 2, 3

        // just search
        System.out.println("queue.peek() = " + queue.peek());   // 1

        // get data
        System.out.println("queue.poll() = " + queue.poll());   // 1
        System.out.println("queue.poll() = " + queue.poll());   // 2
        System.out.println("queue.poll() = " + queue.poll());   // 3
        System.out.println("queue = " + queue);                 // queue = []

    }

}
