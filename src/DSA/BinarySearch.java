package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4,17,10,67,89,90};
        System.out.println(binaryAsc(arr,3));
        int[] arr2 = {90,40,50,10,-1,-6};
        System.out.println(binaryDsc(arr2,-1));
    }

    static int binaryAsc(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
//        int mid = (start+end)/2;//this might exceeds the integer value in java;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int binaryDsc(int[] arr,int target){
            int start = 0;
            int end = arr.length-1;
//        int mid = (start+end)/2;//this might exceeds the integer value in java;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(target<arr[mid]){
                    start = mid+1;
                }else if(target>arr[mid]){
                    end = mid -1;
                }else{
                    return mid;
                }
            }
            return -1;
        }

    }

