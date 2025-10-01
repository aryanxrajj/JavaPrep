package DSA.Graph.UndirectedGraph;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.add(new ArrayList<>(Arrays.asList(2, 3)));

        System.out.println(DFSGraph(adj));

    }

    public static ArrayList<Integer> DFSGraph(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfsRec(adj,res,0,visited);
        return res;
    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, int x, boolean[] visited) {
        visited[x] = true;
        res.add(x);

        for(int i : adj.get(x)){
            if(!visited[i]){
                dfsRec(adj,res,i,visited);
            }
        }
    }
}