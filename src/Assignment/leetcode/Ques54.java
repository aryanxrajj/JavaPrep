package Assignment.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(new List[]{spiral(matrix)}));
//        spiral(matrix);
    }

    static List<Integer> spiral(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        ArrayList<Integer> matrix2 = new ArrayList<>();
//        int[][] arr = int
        int rowbegin = 0, rowend = row - 1;
        int columnbegin = 0, columnend = column - 1;
        while (rowbegin <= rowend && columnbegin <= columnend) {
            if (rowbegin <= rowend && columnbegin <= columnend) {
                for (int i = columnbegin; i <= columnend; i++) {
                    matrix2.add(matrix[rowbegin][i]);
                }
            }
            rowbegin++;
            if (rowbegin <= rowend && columnbegin <= columnend) {
                for (int i = rowbegin; i <= rowend; i++) {
                    matrix2.add(matrix[i][columnend]);
                }
            }
            columnend--;

            if (rowbegin <= rowend && columnbegin <= columnend) {
                for (int i = columnend; i >= columnbegin; i--) {
                    matrix2.add(matrix[rowend][i]);
                }
            }
            rowend--;
            if (rowbegin <= rowend && columnbegin <= columnend) {
                for (int i = rowend; i >= rowbegin; i--) {
                    matrix2.add(matrix[i][columnbegin]);
                }
            }
            columnbegin++;
        }
        return matrix2;
    }
}