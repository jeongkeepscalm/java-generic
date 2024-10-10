package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println("studentMap = " + studentMap);
        // studentMap = {studentB=80, studentA=90, studentD=100, studentC=80}

        // 특정 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);           // result = 100


        // keySet 활용
        Set<String> keySet = studentMap.keySet();           // SET 자료구조로 반환
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
        /*
            key = studentB, value = 80
            key = studentA, value = 90
            key = studentD, value = 100
            key = studentC, value = 80
         */

        // values 활용
        Collection<Integer> values = studentMap.values();   // 컬렉션 반환
        for (Integer value : values) {
            System.out.println("value = " + value);
        }


        // key values 를 묶어 활용하는 entrySet
        // entry: 키와 값을 저장하는 객체
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }


    }

}
