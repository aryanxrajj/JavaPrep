package Recursion.Level2Ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {56,77,45,47,47,12};
        System.out.println(LinearSearch(arr,11));
        System.out.println(Linear(arr,47,0));
    }

    public static int LinearSearch(int[] arr, int target){
        return helper(arr,target,0);
    }

    //Find index
    private static int helper(int[] arr, int target, int i) {
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return helper(arr,target,i+1);
    }

    //Find all Occurrences and Add to the ArrayList
    public static ArrayList<Integer> Linear(int[] arr , int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromCalls = Linear(arr,target,index+1);

        list.addAll(ansFromCalls);
        return list;
    }
}
