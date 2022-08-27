package Hashing;

import java.util.*;

public class hash_Map {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();

        // Insertion put(key,val)  unordered
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        map.put("China",180);
        System.out.println(map);

        //search two form boolean(containsKey) and return int (get)
        if (map.containsKey("China")) System.out.println("present");
        else System.out.println("Not present");

        System.out.println(map.get("India"));

        // iterator
        for (Map.Entry<String ,Integer> e: map.entrySet() ){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // to get only key (just another way)
        Set<String> keys = map. keySet();
        for(String key : keys) {
            System.out.println(key + " "+ map.get(key));
        }
    }
}
