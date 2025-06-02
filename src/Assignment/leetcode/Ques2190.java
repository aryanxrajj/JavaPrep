package Assignment.leetcode;

import java.util.HashMap;

public class Ques2190 {
    public static void main(String[] args) {
        int[] nums = {1,100,200,1,100};
        int key = 1;
        System.out.println(mostFrequent(nums,key));

        int[] nums2 = {2,2,2,2,3};
        int key2 = 2;
        System.out.println(mostFrequent(nums2,key2));


    }

    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == key){
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0) + 1);
            }
        }

        int max = -1, result = 0;
        for(int num : map.keySet()){
            int check = map.get(num);
            if(check > max){
                max = check;
                result = num;
            }
        }

        return result;
    }
}
