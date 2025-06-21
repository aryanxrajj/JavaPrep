package Recursion.Level2Ques;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] { 5,5,3,5}));
    }

    public static boolean isSorted(int[] arr){
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int start) {
        if(start == arr.length - 1){
            return true;
        }

        if(arr[start] > arr[start + 1]){
            return false;
        }

        return helper(arr,start+1);
    }
}

