package LeetCode;

public class Ques121 {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0, cheapest = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < cheapest){
                cheapest = prices[i];
            }else if(prices[i] > cheapest){
                int currentMax = prices[i] - cheapest;
                if(currentMax > maxProfit){
                    maxProfit = currentMax;
                }
            }
        }

        return maxProfit;
    }
}
