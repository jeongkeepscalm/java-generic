package collection.deque.test;

import java.util.*;

public class CommonKeyValueSom1 {

    public static void main(String[] args) {

        // map1, map2에 공통으로 들어있는 키 찾고 그 값의 합을 구하기
        // map1 생성
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);

        // map2 생성
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        /**
         * mine
         */
        int sum = 0;
        Set<String> keySet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();

        // 교집합 추출
        Set<String> intersection = new HashSet<>(keySet1);
        intersection.retainAll(keySet2);

        Iterator<String> iterator = intersection.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer i1 = map1.get(key);
            Integer i2 = map2.get(key);
            sum += i1 + i2;
        }

        System.out.println("intersection = " + intersection);   // [B, C]
        System.out.println("sum = " + sum);                     // 14


        /**
         * teacher
         */
        HashMap<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println("result = " + result);


    }

}
