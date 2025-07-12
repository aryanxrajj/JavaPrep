package LeetCode;

public class Ques334 {
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        boolean result = increasingTriplet(arr);
        System.out.println(result);
    }

    public static boolean increasingTriplet(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 3;

        boolean result = false;

        while(k < nums.length){
            if(nums[i] < nums[j] && nums[i] < nums[k] && nums[j] < nums[k]){
                result = true;
                break;
            }
            i++;
            j++;
            k++;
        }

        return result;
    }
}
