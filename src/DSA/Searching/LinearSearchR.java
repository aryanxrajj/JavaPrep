package DSA.Searching;

import java.util.ArrayList;

public class LinearSearchR {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4};
//        System.out.println(LinearS(arr,4,0));
//        FindAllIndex(arr,4,0);
//        System.out.println(list);
//        ArrayList<Integer> ans = FindallIndex(arr,4,0,new ArrayList<>());
//        System.out.println(ans);
        ArrayList<Integer> list = findallindex(arr,4,0);
        System.out.println(list);
    }
    //Find at the particular index and return the ans.
    public static int  LinearS(int[] arr, int target,int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return LinearS(arr,target,index+1);
        }
    }
    //Find all index where the occurrence in happening.
    static ArrayList<Integer> list = new ArrayList<>();
    public static void FindAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        FindAllIndex(arr,target,index+1);
    }
    //Giving ArrayList inside the parameters of the Function.
    public static ArrayList<Integer> FindallIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return FindallIndex(arr,target,index+1,list);
    }
    //Creating ArrayList inside the body and the return all the ans in a new list.
    public static ArrayList<Integer> findallindex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall = findallindex(arr,target,index+1);

        list.addAll(ansFromBelowCall);
        return list;
    }
}

