package org.example.Terminologies;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(10, 20, 30, 40, 50, 60);
        Collections.sort(prices, Collections.reverseOrder());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> payable = new ArrayList<>();
        List<Integer> discounted = new ArrayList<>();
        for (Integer price : prices) {
            if (!queue.isEmpty() && queue.peek() >= price) {
                discounted.add(price);
                queue.poll();
            } else {
                payable.add(price);
                queue.add(price);
            }
        }
        System.out.println("Payable Items = " + payable);
        System.out.println("Discounted Items = " + discounted);
    }
}