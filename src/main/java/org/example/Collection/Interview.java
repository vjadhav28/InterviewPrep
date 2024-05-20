package org.example.Collection;

import java.util.Arrays;
import java.util.List;

public class Interview {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,7,2,1,5,6,0,2,11,4,0,56,0);



       // List<Integer> res = list.stream().filter(x->x==0).
        int temp ;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if(temp==0)
            {
                list.set(0, temp);
            }
        }
        System.out.println(list);

    }
}
