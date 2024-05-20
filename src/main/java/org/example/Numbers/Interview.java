package org.example.Numbers;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Interview {
    public static void main(String[] args) {

        int[] arr = {0,7,2,1,5,6,0,2,11,4,0,56,0,11,7,56};
        int n = 3;

        LinkedList<Integer> list =  new LinkedList<>();

        for (int i = 0; i <= arr.length-1 ; i++) {
            list.add(arr[i] );
        }
        Collections.sort(list);
        List<Integer> list_sorted = list.stream().distinct().sorted().toList();
        //System.out.println(list_sorted);
        int index = list_sorted.size() - n ;
        int res = list_sorted.get(index);

        List<Integer> L1= list_sorted.stream().filter(x-> x== res).collect(Collectors.toList());
        System.out.println(L1);

    }
}
