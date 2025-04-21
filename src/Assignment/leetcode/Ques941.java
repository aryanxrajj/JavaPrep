package Assignment.leetcode;

public class Ques941 {
    public static void main(String[] args) {
        int[] arr = {2,1};//Example1
        System.out.println(validMountainArray(arr));

        int[] arr1 = {3,5,5};//Example2
        System.out.println(validMountainArray(arr1));;

        int[] arr2 = {0,3,2,1};//Example3
        System.out.println(validMountainArray(arr2));

    }

    public static boolean validMountainArray(int[] arr){
        if(arr.length <= 3){
            return false;
        }

        int i = 1;
        while(i < arr.length && arr[i-1] < arr[i]){
            i++;
        }

        int j = i;
        while(j < arr.length && arr[j-1] > arr[j]){
            j++;
        }

        if(i == 1 || j - i == 0){
            return false;
        }

        return j == arr.length;
    }
}
