package DSA.Searching;
import java.util.Arrays;
public class Binary2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(find2D(arr,50)));

    }

    static int[] find2D(int[][] nums,int target){
        int row = 0;
        int column = nums.length-1;

        while(row<nums.length && column>=0){
            if(nums[row][column]== target){
                return new int[] {row,column};
            }
            if(nums[row][column]>target){
                column--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
