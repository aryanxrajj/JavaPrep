package LeetCode;

public class Ques1095 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,30,20,10};
        System.out.println(findInMountainArray(arr));
    }

    static int findInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
