package Assignment.leetcode;

public class Ques605 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(arr,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0;i < flowerbed.length-1;i++){
            if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                n--;
            }
        }

        if(n == 0) {
            return true;
        }
        return false;
    }
}
