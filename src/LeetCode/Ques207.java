package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ques207 {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisite = {
                {0 , 1},
                {1 , 0}
        };

        System.out.println(canFinish(numCourses,prerequisite));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = buildAdj(numCourses,prerequisites);
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(dfs(i,visited,recStack,adjList)){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean dfs(int source, boolean[] visited, boolean[] recStack, List<List<Integer>> adjList){
        visited[source] = true;
        recStack[source] = true;

        for(int x : adjList.get(source)){
            if(!visited[x] && dfs(x,visited,recStack,adjList)) {
                return true;
            } else if (recStack[x]) {
                return true;
            }
        }

        recStack[source] = false;
        return false;
    }

    public static List<List<Integer>> buildAdj(int V, int[][] matrix){
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] mat : matrix){
            int u = mat[0];
            int v = mat[1];

            adjList.get(u).add(v);
        }

        return adjList;
    }
}
