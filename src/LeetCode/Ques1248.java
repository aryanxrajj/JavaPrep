package LeetCode;

import java.util.HashMap;

public class Ques1248 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums,k));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num : nums){
            prefixSum += num % 2;
            count += map.getOrDefault(prefixSum - k , 0);
            map.put(prefixSum , map.getOrDefault(prefixSum - k, 0) + 1);
        }

        return count;
    }
}
