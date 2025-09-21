package LeetCode;

import java.util.*;

public class Ques1971 {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
                {0,1},
                {0,2},
                {3,5},
                {5,4},
                {4,3}
        };
        int source = 0;
        int destination = 5;

        System.out.println(validPath(n,edges,source,destination));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) {
                return true;
            }
            List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }
}
