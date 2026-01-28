package DSA.Graph.DirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnsAlgorithm {
    public static void main(String[] args) {
        int numCourses = 3;
        int[][] prerequisites = {
                {0,2},
                {2,1},
                {1,0}
        };

        System.out.println(kahnAlgorithm(numCourses,prerequisites));
    }

    //Topological Sorting Or Cycle Detection in Directed Graph
    public static boolean kahnAlgorithm(int courses, int[][] prerequisites){
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < courses; i++) adjList.add(new ArrayList<>());

        int[] indegree = new int[courses];
        for(int[] list: prerequisites){
            adjList.get(list[1]).add(list[0]);
            indegree[list[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < courses; i++){
            if(indegree[i] == 0) queue.offer(i);
        }

        int processed = 0;
        while(!queue.isEmpty()){
            int x = queue.poll();
            processed++;

            for(int nei: adjList.get(x)){
                indegree[nei]--;
                if(indegree[nei] == 0) queue.offer(nei);
            }
        }

        return (processed == courses);
    }


}
