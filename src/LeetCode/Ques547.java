package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ques547 {
    public static void main(String[] args) {
        int[][] graph = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        System.out.println(findCircleNum(graph));
    }

    public static int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = buildAdj(isConnected);
        boolean[] visited = new boolean[isConnected.length];
        List<List<Integer>> res = new ArrayList<>();

        int V = isConnected.length;

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                List<Integer> component = new ArrayList<>();
                dfs(i,adj,visited,component);
                res.add(component);
            }
        }

        return res.size();

    }

    public static void dfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> component){
        vis[node] = true;
        component.add(node);

        for(int neighbor : adj.get(node)){
            if(!vis[neighbor]){
                vis[neighbor] = true;
                dfs(node,adj,vis,component);
            }
        }
    }

    public static List<List<Integer>> buildAdj(int[][] graph){
        int V = graph.length;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(i != j && graph[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        return adj;
    }
}
