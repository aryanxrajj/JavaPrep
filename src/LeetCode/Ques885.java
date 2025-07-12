package LeetCode;

import java.util.Arrays;

public class Ques885 {
    public static void main(String[] args) {
        for (int[] j : spiralMatrixIII(1, 4, 0, 0)) {
            System.out.println(Arrays.toString(j));
        }

    }

    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int row = rStart;
        int col = cStart;
        int steps = rows * cols;
        int index = 0;
        int times = 0;
        int direction = 0; // 0 = right, 1 = down, 2 = left, 3 = up

        result[index++] = new int[] {row, col};

        while (index < steps) {
            if (direction == 0 || direction == 2) {
                times++;
            }

            for (int i = 0; i < times; i++) {
                if (direction == 0) {
                    col++;
                } else if (direction == 1) {
                    row++;
                } else if (direction == 2) {
                    col--;
                } else if (direction == 3) {
                    row--;
                }

                // Check boundaries and add coordinates only if within the grid
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    result[index++] = new int[] {row, col};
                }
            }
            direction = (direction + 1) % 4; // Cycle through directions
        }
        return result;
    }
}
