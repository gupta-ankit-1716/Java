package lecture.codes.CollectionsAndGenerics.Maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {

    static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("Oggy" , 34);
        map.put("Jack" , 74);
        map.put("Bob" , 100);
        map.put("Olivia" , 88);

        System.out.println(map.size());
        System.out.println(map.get("Oggy"));
        System.out.println(map.containsKey("Jack"));
        System.out.println(map.containsKey("Dee"));
        System.out.println(map.remove("Jack"));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.printf("%s : %s%n" , key, map.get(key));
        }

    }

}
