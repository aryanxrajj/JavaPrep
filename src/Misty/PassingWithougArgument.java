package Misty;

import java.util.ArrayList;
import java.util.Arrays;

public class PassingWithougArgument {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,7,7,6};
//        Arrays.sort(arr);
        System.out.println(without(arr,7,0));
    }

    private static ArrayList<Integer> without(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = without(arr,target,index+1);

        list.addAll(ansFromBelow);
        return list;
    }
}
