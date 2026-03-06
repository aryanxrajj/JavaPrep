package LeetCode;

public class Ques42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;

        int trappedWater = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left]; // LeftMax bar seen so far.
                }else{
                    trappedWater += leftMax - height[left]; // If not the water is trapped
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right]; // RightMax bar seen so far..
                }else{
                    trappedWater += rightMax - height[right]; // If not the water is trapped
                }
                right--;
            }
        }

        return trappedWater;
    }
}
