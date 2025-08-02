package DSA.Graph.UnweightedGraph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        System.out.println(BFSGraph(adj));
    }

    public static ArrayList<Integer> BFSGraph(ArrayList<ArrayList<Integer>> list){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];

        int s = 0;
        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int curr = queue.poll();;
            res.add(curr);

            for(int x : list.get(curr)){
                if(!visited[x]){
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }

        return res;
    }
}
