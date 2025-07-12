package leetcode;

public class Ques1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int j = 1;
        for(int i = 0;i<nums.length;i++){
            for(j = 0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}
