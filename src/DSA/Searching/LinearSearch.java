package DSA.Searching;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int target = input.nextInt();
        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch(arr,target,1,3));


    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }

    static int linearSearch(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
