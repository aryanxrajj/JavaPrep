package LeetCode;

import java.util.*;

public class Ques802 {
    public static void main(String[] args) {
        int[][] graph = {
                {1,2},{2,3},{5},{0},{5},{},{}
        };

        System.out.println(eventualSafeNodes(graph));
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[graph.length];
        List<Integer> res = new ArrayList<>();
        int idx = 0;
        for(int i = 0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] g : graph){
            for(int a : g){
                adj.get(a).add(idx);
            }
            indegree[idx]=g.length;
            idx++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<graph.length;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);
            for(int nei : adj.get(node)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.offer(nei);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
