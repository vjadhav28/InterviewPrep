package org.example.Terminologies;

import java.util.*;

public class SimpleCache<K, V> {
    private final Map<K, V> cache;
    private final int capacity;

    public SimpleCache(int capacity) {
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
        this.capacity = capacity;
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public Set<K> keySet() {
        return cache.keySet();
    }

    public int size() {
        return cache.size();
    }

    public void clear() {
        cache.clear();
    }

    public boolean isEmpty() {
        return cache.isEmpty();
    }

    @Override
    public String toString() {
        return cache.toString();
    }
    public static void main(String[] args) {
        SimpleCache<Integer, String> cache = new SimpleCache<>(3); // Cache with capacity 3

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println(cache); // {1=One, 2=Two, 3=Three}

        cache.put(4, "Four"); // Evicts the least recently used entry (1=One)
        System.out.println(cache); // {2=Two, 3=Three, 4=Four}

        System.out.println(cache.get(2)); // Output: Two
        System.out.println(cache.get(5)); // Output: null (not found)
    }
}