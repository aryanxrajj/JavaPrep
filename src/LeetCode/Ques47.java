package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ques47 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(permuteUnique(arr));
    }

    static HashSet<List<Integer>> set = new HashSet<>();
    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> unprocessed = new ArrayList<>();
        for(int num : nums){
            unprocessed.add(num);
        }
        permute(new ArrayList<>(),unprocessed);
        return result;
    }

    //Ye function jo neeche hai woh galat isliye kripa karke isse na padhe kabhi bhii...
    //Aur Baad me sahi karlee jab bhi aapka mood ho...
    public static void permute(ArrayList<Integer> processed, ArrayList<Integer> unprocessed){
        if(unprocessed.isEmpty()){
            if(set.add(processed)){
                result.add(processed);
            }
            return;
        }

        int element = unprocessed.remove(0);

        for(int i = 0; i <= processed.size(); i++){
            ArrayList<Integer> internal = new ArrayList<>(processed);
            internal.add(i,element);
            permute(internal,new ArrayList<>(unprocessed));
        }
    }
}
