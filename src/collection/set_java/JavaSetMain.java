package collection.set_java;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>());           // 출력 순서: 랜덤        O(1)
        run(new LinkedHashSet<>());     // 출력 순서: 입력한 순서   O(1)
        run(new TreeSet<>());           // 출력 순서: 자동 정렬     O(log n)

    }

    private static void run(Set<String> set) {
        System.out.println(set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        /*
            class java.util.HashSet
            A 1 B 2 C

            class java.util.LinkedHashSet
            C B A 1 2

            class java.util.TreeSet
            1 2 A B C
         */
    }

}
