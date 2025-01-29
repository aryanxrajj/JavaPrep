package HackerRank;

public class Hourglass {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1 ,1 ,0, 0, 0},
                {0 ,1 ,0, 0, 0, 0},
                {1 ,1 ,1 ,0 ,0 ,0},
                {0 ,0, 0, 0, 0, 0},
                {0 ,0 ,0 ,0 ,0 ,0},
                {0 ,0, 0, 0, 0 ,0}
        };
        System.out.println(findhourglass(arr));

    }

    static int findhourglass(int[][] arr){
        int max  =Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++) {
            for (int j = 0; j < arr.length-2; j++) {
                int sum = 0;
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = sum > max ? sum : max;
            }
        }
        return max;
    }
}
