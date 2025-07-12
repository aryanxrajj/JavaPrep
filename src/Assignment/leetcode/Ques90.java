package Assignment.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Ques90 {
    public static void main(String[] args) {
        System.out.println(getAllSubSequence(new int[]{4,4,1,4}));
    }

    public static List<List<Integer>> getAllSubSequence(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        result.add(new ArrayList<>());
        set.add(new ArrayList<>());
        for(int num : arr){
            int n = result.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(result.get(i));
                internal.add(num);
                result.add(internal);
                set.add(internal);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

//    [[],[1],[1,4],[1,4,4],[1,4,4,4],[1,4,4,4,4],[4],[4,4],[4,4,4],[4,4,4,4]]
}
