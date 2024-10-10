package collection.deque.test;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToMapTest {

    public static void main(String[] args) {

        // change array to map
        String[][] productArr = {{"Java", "10000"}, {"String", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> map = Stream.of(productArr)
                .collect(Collectors.toMap(v -> v[0], v -> Integer.valueOf(v[1])));

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = "+ key + ", value = " + value);
        }

    }

}
