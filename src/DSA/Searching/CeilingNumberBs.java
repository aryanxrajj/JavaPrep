package DSA.Searching;

public class CeilingNumberBs {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        check(arr,15);
    }

    static void check(int[] arr,int target){
        int start = 0;
        int end  = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid+1]){
                end = mid -1;
            }
        }
        System.out.println(arr[end]);

    }
}
