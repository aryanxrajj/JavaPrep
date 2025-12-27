package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ques542 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,0},
                {0,1,0},
                {1,2,1}
        };

        for(int[] res : updateMatrix(matrix)){
            System.out.println(Arrays.toString(res));
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0;j < n; j++){
                if(mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }else{
                    mat[i][j] = -1;
                }
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            for(int[] dir : directions){
                int nr = curr[0] + dir[0];
                int nc = curr[1] + dir[1];

                if(nr >= 0 && nr < m && nc >= 0 && nc < n && mat[nr][nc] == -1){
                    mat[nr][nc] = mat[curr[0]][curr[1]] + 1;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }

        return mat;
    }
}
