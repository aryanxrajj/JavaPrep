package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Ques994 {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[] {i,j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int minutes = -1;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            minutes++;

            for(int i = 0;i < size; i++){
                int[] curr = queue.poll();
                int r = curr[0] , c = curr[1];
                for(int[] d : directions){
                    int nr = r + d[0], nc = c + d[1];
                    if(nr >= 0 && nr < row && nc >=0 && nc < col && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.add(new int[]{nr,nc});
                    }
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}
