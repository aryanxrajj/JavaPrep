package DSA.SlidingWindow;

public class FixedSizeSW {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 1, 5};
        int size = 3;
        System.out.println(maxSum(arr, size));
    }

    private static int maxSum(int[] arr, int size) {
        int maxSum = 0,windowSum = 0;

        for(int i = 0; i < size ;i++){
            windowSum+=arr[i];
        }

        maxSum = windowSum;

        for(int i = size;i < arr.length;i++){
            windowSum += arr[i] - arr[i - size];
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum;
    }
}
