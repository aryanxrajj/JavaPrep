package Assignment.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques1431 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extracandies = 1;
        System.out.println(Arrays.toString(new List[]{kidsWithCandies(candies, extracandies)}));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> Candies = new ArrayList<>();
        int max = candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int total = candies[i]+extraCandies;
            if(total>=max){
                Candies.add(true);
            }else{
                Candies.add(false);
            }
        }
        return Candies;
    }
}
