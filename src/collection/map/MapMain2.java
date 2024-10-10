package collection.map;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // 같은 키로 저장시 덮어 씌어진다. 
        map.put("ojg", 90);
        map.put("ojg", 100);
        System.out.println("map = " + map);     // map = {ojg=100}

        map.putIfAbsent("ojg", 30);
        map.putIfAbsent("hwang", 100);
        System.out.println("map = " + map);     // map = {hwang=100, ojg=100}

    }

}
