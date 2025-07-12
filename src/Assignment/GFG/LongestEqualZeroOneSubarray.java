package Assignment.GFG;

import java.util.HashMap;
import java.util.Map;

public class LongestEqualZeroOneSubarray {
    public static int findMaxLength(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, sum = 0;
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0 ? -1 : 1);

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 1, 1, 0, 0};
        int[] arr2 = {0, 0, 1, 1, 0};
        int[] arr3 = {0};

        System.out.println(findMaxLength(arr1));
        System.out.println(findMaxLength(arr2));
        System.out.println(findMaxLength(arr3));
    }
}
