package Recursion.Level1Ques;

public class Ques5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println("Min Element: "+ findMin(arr,arr.length - 1));
    }

    public static int findMin(int[] arr, int index){
        if(index == 0){
            return arr[0];
        }

        return Math.min(arr[index],findMin(arr,index - 1));
    }
}
