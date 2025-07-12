package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ques78 {
    public static void main(String[] args) {
        System.out.println(getAllSubSequence(new int[]{1,2,3}));
    }

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
