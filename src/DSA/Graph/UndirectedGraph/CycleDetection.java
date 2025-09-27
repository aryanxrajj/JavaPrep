package DSA.Graph.UndirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {{0,1}, {1,2}, {2,3}, {3,4}, {4,1}};
        int[][] edges2 = {{0,1},{1,2},{0,2}};

        List<List<Integer>> adj = buildGraph(V, edges2);
        System.out.println(isCycle(V, adj)); // true
    }

    public static List<List<Integer>> buildGraph(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]); // undirected
        }
        return adj;
    }


    public static boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) {
                    return true; // cycle found
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // already visited and not the parent → cycle
                return true;
            }
        }
        return false;
    }


}
