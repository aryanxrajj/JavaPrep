package DSA.Graph.DirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[][] directed = {
                {0,1},
                {1,2},
                {2,0}
        };
        int V = 3;

        makeAdjList(directed,adjList,V);
        display(adjList);
    }

    public static void makeAdjList(int[][] directed, List<List<Integer>> adjList,int V){
        for(int i  = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] dir : directed){
            int u = dir[0];
            int v = dir[1];

            adjList.get(u).add(v);
        }
    }

    public static void display(List<List<Integer>> adjList){
        for(int i = 0; i < adjList.size(); i++){
            System.out.print(i + "-> ");
            for(int x : adjList.get(i)){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
