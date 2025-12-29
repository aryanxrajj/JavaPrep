package DSA.Graph.DirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionUsingDFS {
    public static void main(String[] args) {
        int V = 3;
        int[][] matrix = {
                {0,2},
                {2,1},
                {1,0}
        };

        System.out.println(cycleExists(V,matrix));
    }

    public static boolean cycleExists(int V, int[][] matrix){
        List<List<Integer>> adjList = buildAdj(V,matrix);
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(dfs(i,visited,recStack,adjList)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(int node, boolean[] visited, boolean[] recStack, List<List<Integer>> adjList){
        visited[node] = true;
        recStack[node] = true;

        for(int x : adjList.get(node)){
            if(!visited[x]){
                if(dfs(x,visited,recStack,adjList)){
                    return true;
                }
            }else if(recStack[x]){
                return true;
            }
        }

        recStack[node] = false;
        return false;
    }

    public static List<List<Integer>> buildAdj(int V, int[][] matrix){
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] mat : matrix){
            adjList.get(mat[0]).add(mat[1]);
        }

        return adjList;
    }
}
