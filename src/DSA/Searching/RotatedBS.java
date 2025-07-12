package DSA;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
