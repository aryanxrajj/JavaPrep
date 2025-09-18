package DSA.Graph.UnweightedGraph;

import java.util.ArrayList;

public class ConnectedComponent {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
                { 0 , 1 },
                { 1 , 2 },
                { 3 , 4 },
        };

        ArrayList<ArrayList<Integer>> res = buildAdjList(edges, V);

        for(ArrayList<Integer> list : res){
            System.out.println(list);
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
}
