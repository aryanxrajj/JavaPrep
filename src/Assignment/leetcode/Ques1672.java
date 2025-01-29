package Assignment.leetcode;

import java.util.Arrays;

public class Ques1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {8,2,4}
        };
        System.out.println(richest(arr));
    }

    static int richest(int[][] arr){
        if(arr.length==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;
    }
}
