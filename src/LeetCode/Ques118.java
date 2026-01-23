package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ques118 {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        for(List<Integer> res : result){
            System.out.println(res);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(i == j || j == 0){
                    arr.add(1);
                }else{
                    arr.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(arr);
        }

        return result;

    }

}
