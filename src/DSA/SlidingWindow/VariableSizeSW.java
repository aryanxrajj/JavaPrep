package DSA.SlidingWindow;


public class VariableSizeSW {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(variableSizeWindow(arr,target));
    }

    public static int variableSizeWindow(int[] arr, int target){
        int start = 0 , minLen = Integer.MAX_VALUE, sum = 0;

        for(int end = 0; end < arr.length; end++){
            sum+=arr[end];

            while(sum >= target){
                minLen = Math.min(minLen,end - start + 1);
                sum-=arr[start++];
            }
        }

        return minLen;
    }
}
