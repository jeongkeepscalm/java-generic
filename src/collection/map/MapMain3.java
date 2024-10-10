package collection.map;

import java.util.*;

public class MapMain3 {

    public static void main(String[] args) {

        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());

        /*
            map = class java.util.HashMap
            A=30 1=40 B=20 2=50 C=10

            map = class java.util.LinkedHashMap
            C=10 B=20 A=30 1=40 2=50

            map = class java.util.TreeMap
            1=40 2=50 A=30 B=20 C=10
         */

    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }

}
