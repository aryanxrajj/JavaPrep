package Lectures;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},//0 index
                {1,3},// 1 index
                {1,5,5}// 2 index
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr[0]));

    }
}
