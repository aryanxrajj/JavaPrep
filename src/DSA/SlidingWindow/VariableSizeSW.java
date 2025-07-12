package DSA.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class VariableSizeSW {
    //Geeks For Geeks
    public static int maxLen(int[] arr) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int maxLen = 0, prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLen = i + 1; // sum from 0 to i is 0
            }

            if (prefixMap.containsKey(prefixSum)) {
                int prevIndex = prefixMap.get(prefixSum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                prefixMap.put(prefixSum, i); // store only first occurrence
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr2 = {2, 10, 4};
        int[] arr3 = {1, 0, -4, 3, 1, 0};

        System.out.println(maxLen(arr1)); // Output: 5
        System.out.println(maxLen(arr2)); // Output: 0
        System.out.println(maxLen(arr3)); // Output: 5
    }
}
