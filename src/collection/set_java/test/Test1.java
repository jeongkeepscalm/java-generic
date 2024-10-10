package collection.set_java.test;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {

        // 1.
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 중복 제거(순서 유지 x)
        HashSet<Integer> hashSet = new HashSet<Integer>(List.of(inputArr));
        System.out.println("hashSet = " + hashSet);                 // 20, 10, 30

        // 중복 제거(입력 순서 유지)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(inputArr));
        System.out.println("linkedHashSet = " + linkedHashSet);     // 30, 20, 10

        // 중복 제거(입력된 데이터 값으로 정렬)
        TreeSet<Integer> treeSet = new TreeSet<Integer>(List.of(inputArr));
        System.out.println("treeSet = " + treeSet);


        // 2. 두 집합의 합집합, 교집합, 차집합(A-B)을 구하여라
        HashSet<Integer> setA = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> setB = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("union = " + union);                     // 1, 2, 3, 4, 5, 6, 7

        // 교집합
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("intersection = " + intersection);       // 3, 4, 5

        // 차집합
        HashSet<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println("differenceSet = " + differenceSet);     // 1, 2

    }

}
