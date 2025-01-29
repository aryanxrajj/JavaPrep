package Lectures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Additional {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {1,2,3,4},
                {5,6,7,8}
        };

        for(int i=0;i<arr.length;i++){
            int end = arr[0].length-1;
            for(int j =0;j<arr[i].length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][end];
                arr[i][end] = temp;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr[0]));
    }
}
