package Misty;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,6,5};
//        findallindex(arr,4,0);
//        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(Findallindex(arr,4,0,list));
    }

    public static boolean IsSorted(int[] arr, int index) {
        if (index == arr.length-1) {
            return true;
        }

        return arr[index]<arr[index+1] && IsSorted(arr,index+1);
    }
    //Find all the indexes of the target element.
    static ArrayList<Integer> list =  new ArrayList<>();
    public static void findallindex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findallindex(arr,target,index+1);
    }
    //Calling ArrayList Inside the Function.
    public static ArrayList<Integer> Findallindex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
         return Findallindex(arr,target,index+1,list);
    }
}
