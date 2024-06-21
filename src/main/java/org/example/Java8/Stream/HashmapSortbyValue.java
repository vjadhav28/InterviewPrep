package org.example.Java8.Stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapSortbyValue {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(22,"A");
        hashmap.put(55,"B");
        hashmap.put(33,"Z");
        hashmap.put(44,"M");
        hashmap.put(99,"I");
        hashmap.put(88,"X");

        LinkedHashMap<Integer, String>  sort= hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        //sort.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println(sort);

    }
}
