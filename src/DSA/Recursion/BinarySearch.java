package DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(binarysearchRecursion(arr,target));
    }

    private static int binarysearchRecursion(int[] arr, int target) {
        return binarysearch(arr,target,0,arr.length - 1);
    }

    private static int binarysearch(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return binarysearch(arr,target,0,mid-1);
        }else{
            return binarysearch(arr,target,mid+1,end);
        }
    }
}
