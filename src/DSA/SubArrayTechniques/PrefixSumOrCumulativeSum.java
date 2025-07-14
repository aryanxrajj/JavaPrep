package DSA.SubArrayTechniques;

import java.util.Arrays;

public class PrefixSumOrCumulativeSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(prefixSum(arr)));
    }
    //Idea: Use a prefix sum array to compute the sum of any subarray in O(1).
    //Time Complexity: O(n) preprocessing + O(1) per query.
    //Use When: Working with subarray sums.
    public static int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }
}
