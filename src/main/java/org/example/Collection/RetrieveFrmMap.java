package org.example.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class RetrieveFrmMap {

        public static void main(String[] args) {
        /*1*/    Map<String, String> books = new HashMap<>();
            books.put("123-A", "DS");
            books.put("324-A", "c++");
            books.put("13-B", "Java");
            books.put("13-C", "Java");
            //books.entrySet().stream().

            Optional<String> ans = books.entrySet().stream()
                    .filter(a -> a.getValue().equalsIgnoreCase("Java"))
                    .map(Map.Entry::getKey).findFirst();

            System.out.println(ans);

            Set<Map.Entry<String, String>> entries = books.entrySet();
            System.out.println(entries);
            System.out.println(books);
        }
    }

