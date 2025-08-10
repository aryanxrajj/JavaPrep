package DSA.Graph.UnweightedGraph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            list.add(new ArrayList<>());
        }

        addEdge(list,0,1);
        addEdge(list,0,2);
        addEdge(list,2,3);
        addEdge(list,1,3);
        addEdge(list,1,2);

        display(list);
    }

    public static void addEdge(List<List<Integer>> list, int i, int j){
        list.get(i).add(j);
        list.get(j).add(i);
    }

    public static void display(List<List<Integer>> list){
       for(int i = 0; i < list.size(); i++){
           System.out.print(i + ": ");
           for(int j = 0; j < list.get(i).size(); j++){
               System.out.print(list.get(i).get(j) + " ");
           }
           System.out.println();

       }
    }
}
