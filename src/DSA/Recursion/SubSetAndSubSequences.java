package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetAndSubSequences {
    public static void main(String[] args) {
        System.out.println(getAllSubSequenceDuplicate(new int[]{1,2,2}));
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

    public static List<List<Integer>> getAllSubSequenceDuplicate(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int start = 0, end = 0;

        for(int i = 0; i < arr.length ;i++){
            start = 0;
            // If Previous Element and current is same then we have to ignore last added list;
            if(i > 0 && arr[i -1] == arr[i]){
                start =  end + 1;
            }
            end = result.size() - 1;
            int n = result.size();
            for(int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(result.get(j));
                internal.add(arr[i]);
                result.add(internal);
            }
        }

        return result;
    }
}
