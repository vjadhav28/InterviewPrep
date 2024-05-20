package org.example;

import java.util.*;

public class WeightedPath {

    public static String shortestPath(String[] strArr) {

        // Parse the input array
        int numNodes = Integer.parseInt(strArr[0]);
        String[] nodes = new String[numNodes];
        Map<String, Map<String, Integer>> graph = new HashMap<>();

        for (int i = 1; i <= numNodes; i++) {
            nodes[i - 1] = strArr[i];
            graph.put(nodes[i - 1], new HashMap<>());
        }

        for (int i = numNodes + 1; i < strArr.length; i++) {
            String[] edge = strArr[i].split("\\|");
            String node1 = edge[0];
            String node2 = edge[1];
            int weight = Integer.parseInt(edge[2]);

            graph.get(node1).put(node2, weight);
            graph.get(node2).put(node1, weight);
        }

        // Initialize variables for Dijkstra's algorithm
        String startNode = nodes[0];
        String endNode = nodes[numNodes - 1];
        Map<String, Integer> distances = new HashMap<>();
        distances.put(startNode, 0);
        for (String node : nodes) {
            if (!node.equals(startNode)) {
                distances.put(node, Integer.MAX_VALUE);
            }
        }
        Set<String> visited = new HashSet<>();

        // Implement Dijkstra's shortest path algorithm
        while (visited.size() < numNodes) {
            String currentNode = null;
            int minDistance = Integer.MAX_VALUE;
            for (String node : distances.keySet()) {
                if (!visited.contains(node) && distances.get(node) < minDistance) {
                    currentNode = node;
                    minDistance = distances.get(node);
                }
            }

            if (currentNode == null) {
                break;
            }

            visited.add(currentNode);

            for (Map.Entry<String, Integer> neighbor : graph.get(currentNode).entrySet()) {
                String neighborNode = neighbor.getKey();
                int weight = neighbor.getValue();

                if (!visited.contains(neighborNode)) {
                    int newDistance = distances.get(currentNode) + weight;
                    if (newDistance < distances.get(neighborNode)) {
                        distances.put(neighborNode, newDistance);
                    }
                }
            }
        }

        List<String> path = new ArrayList<>();
        if (distances.get(endNode) == Integer.MAX_VALUE) {
            return "-1";
        }

        reconstructPath(endNode, startNode, graph, distances, path);

        return String.join("-", path);
    }

    private static void reconstructPath(String node, String startNode, Map<String, Map<String, Integer>> graph, Map<String, Integer> distances, List<String> path) {
        if (node.equals(startNode)) {
            path.add(0, node); // Add at the beginning
            return;
        }

        for (Map.Entry<String, Integer> neighbor : graph.get(node).entrySet()) {
            String neighborNode = neighbor.getKey();
            int weight = neighbor.getValue();

            if (distances.get(node) - weight == distances.get(neighborNode)) {
                reconstructPath(neighborNode, startNode, graph, distances, path);
                path.add(node); // This adds the node after all its predecessors have been added
                return;
            }
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"4","A","B","C","D", "A|B|2", "C|B|11", "C|D|3", "B|D|2"};
        String result = shortestPath(strArr);
        System.out.println(result);  // Output: A-B-D
    }
}