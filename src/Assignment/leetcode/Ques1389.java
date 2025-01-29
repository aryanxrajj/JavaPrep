package Assignment.leetcode;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Ques1389 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        int indexs = 0;
        for (int i = 0; i < nums.length; i++) {
            indexs = index[i];
            target.add(nums[indexs]);
        }
        int[] arr = target.stream().mapToInt(i -> i).toArray();
        return arr;
    }

}
