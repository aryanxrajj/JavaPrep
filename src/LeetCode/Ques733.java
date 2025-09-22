package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ques733 {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] image2 = {{0,0,0},{0,0,0}};
        int sr = 0, sc = 0, color = 0;

        int[][] res = floodFill(image2,sr,sc,color);
        for(int[] row : res){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row = image.length;
        int col = image[0].length;
        int startingcolor = image[sr][sc];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {sr,sc});
        image[sr][sc] = color;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            int[] rc = queue.poll();
            int r = rc[0] , c = rc[1];

            for(int[] newDir : directions){
                int nr = r + newDir[0], nc = c + newDir[1];

                if(nr >= 0 && nr < row && nc >=0 && nc < col && (image[nr][nc] == startingcolor)){
                    if(image[nr][nc] != color) {
                        image[nr][nc] = color;
                        queue.add(new int[]{nr, nc});
                    }

                }
            }
        }

        return image;
    }
}
