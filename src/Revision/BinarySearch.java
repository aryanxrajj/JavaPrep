package Revision;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,45,67,79,87,97};
        int result = binarySearch(arr,87);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
