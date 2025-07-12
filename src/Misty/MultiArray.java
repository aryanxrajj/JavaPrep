package Misty;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,5,6},//0th index
                {2,6,},//1st index
                {3,5,7},//2nd index
                {1,6,7,8,9}//3rd index
        };

        for(int row=0;row< arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
/*
            {0,1,2,4,6,7,9}
            { {1,4,5,6},{2,6,7,8},}
 */
}
