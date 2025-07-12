package DSA.Searching;

import java.util.Arrays;

public class MultiLinearSearch {
    public static void main(String[] args) {
        int [][] arr =  {
                {1,2,3,4},
                {1,2,3},
                {1,3,4,5},
                {2,4,5,6,6}
        };

        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }

        int[] result = search(arr,5);//format to return value of {row,column};
        System.out.println(Arrays.toString(result));
        System.out.println(max(arr));

    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
               if(arr[row][column]==target){
                   return new int[] {row,column};
               }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column]>max){
                    max=arr[row][column];
                }
            }
        }
        return max;
    }
}
