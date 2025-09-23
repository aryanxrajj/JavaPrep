package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Question1020 {
    public static void main(String[] args) {
        int[][] grid1 = {
                {0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}
        };

        int[][] grid2 = {
                {0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}
        };

        System.out.println(numEnclaves(grid1));
        System.out.println(numEnclaves(grid2));
    }

    public static int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < col; i++){
            if(grid[0][i] == 1) queue.offer(new int[] {0,i});
        }

        for(int i = 0; i < col; i++){
            if(grid[row - 1][i] == 1) queue.offer(new int[] {row - 1, i});
        }

        for(int i = 0;i < row; i++){
            if(grid[i][0] == 1) queue.offer(new int[] {i,0});
        }

        for(int i = 0;i < row; i++){
            if(grid[i][col - 1] == 1) queue.offer(new int[] {i , col - 1});
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            if(grid[r][c] != 1) continue;

            grid[r][c] = 2;

            for(int[] d : directions){
                int nr = d[0] + r, nc = d[1] + c;

                if(nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1){
                    queue.offer(new int[] {nr, nc});
                }
            }
        }

        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1) count++;
            }
        }

        return count;
    }
}
