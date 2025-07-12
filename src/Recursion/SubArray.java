package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        System.out.println(getAllSubSequence(new int[]{1,2,3}));
    }
    //For Subset
    public static List<List<Integer>> getAllSubArray(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for(int start = 0; start < n; start++){
            List<Integer> current = new ArrayList<>();
            for(int end = start; end < n; end++) {
                current.add(arr[end]);
                result.add(new ArrayList<>(current));
            }
        }

        return result;
    }

    //For SubSequence
    public static List<List<Integer>> getAllSubSequence(int[] arr){
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for(int num : arr){
            int n = result.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(result.get(i));
                internal.add(num);
                result.add(internal);
            }
        }

        return result;
    }
}
