package DSA.Graph.UndirectedGraph;

import java.util.ArrayList;

public class ConnectedComponent {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
                { 0 , 1 },
                { 1 , 2 },
                { 3 , 4 },
        };

        ArrayList<ArrayList<Integer>> res = getComponent(edges, V);
        for(ArrayList<Integer> edge : res){
            System.out.println(edge);
        }
    }

    public static ArrayList<ArrayList<Integer>> buildAdjList(int[][] edges, int V){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < V ; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }

    public static void dfs(int node , ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> component){
        vis[node] = true;
        component.add(node);

        for(int neighbor : adj.get(node)){
            if(!vis[neighbor]){
                dfs(neighbor,adj,vis,component);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> getComponent(int[][] edges, int V){
        ArrayList<ArrayList<Integer>> adj = buildAdjList(edges,V);
        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i,adj,visited,component);
                res.add(component);
            }
        }

        return res;
    }
}
