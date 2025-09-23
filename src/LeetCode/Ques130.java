package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ques130 {
    public static void main(String[] args) {
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        solve(board);
        for(char[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        Queue<int[]> queue  = new LinkedList<>();
        //Traversing in the first Row
        for(int i = 0; i < col ; i++){
            if(board[0][i] == 'O'){
                queue.offer(new int[] {0 ,i});
            }
        }
        //Traversing in the last Row
        for(int i = 0; i < col; i++){
            if(board[row - 1][i] == 'O'){
                queue.offer(new int[] {row-1,i});
            }
        }
        //Traversing in the first Column
        for(int i  = 0 ; i < row ; i++){
            if(board[i][0] == '0'){
                queue.offer(new int[] {i,0});
            }
        }
        //Traversing in the Last Column
        for(int i  = 0 ; i < row ; i++){
            if(board[i][col - 1] == '0'){
                queue.offer(new int[] {i,0});
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            if(board[r][c] != 'O') continue;
            board[r][c] = '#'; // they are safe

            for(int[] d : directions){
                int nr = r + d[0], nc = c + d[1];

                if(nr >= 0 && nr < r && nc >= 0 && nc < c && board[nr][nc] == 'O'){
                    queue.offer(new int[] {nr,nc});
                }
            }
        }

        for(int i = 0; i < row ; i++){
            for(int j = 0; j < col ; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if (board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }

    }
}
