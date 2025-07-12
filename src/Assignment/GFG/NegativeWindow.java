package Assignment.GFG;

import java.util.ArrayList;
import java.util.List;

public class NegativeWindow {
    public static void main(String[] args) {
        System.out.println(firstNegInt(new int[] {12, -1, -7, 8, -15, 30, 16, 28} , 2));
    }

    //Not that much Optimize giving little less than O(n2) but Question exactly O(n)
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();

        int start = 0, end = k - 1;
        int traverse = 0;

        while(end < arr.length || traverse <=end){
            if(end >= arr.length){
                break;
            }

            if(arr[traverse] < 0){
                list.add(arr[traverse]);
                start++;
                end++;
                traverse = start;
            }else{
                traverse++;
            }

            if(traverse > end){
                list.add(0);
                start++;
                end++;
                traverse = start;
            }
        }


        return list;
    }
}
