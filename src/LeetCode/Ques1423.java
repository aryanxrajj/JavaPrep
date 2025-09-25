package LeetCode;

import java.util.Arrays;

public class Ques1423 {
    public static void main(String[] args) {
        int[] cp = {1,79,80,1,1,1,200,1};
        int k = 3;

        System.out.println(maxScore(cp,k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int windowSize = cardPoints.length - k;

        int windowSum = 0;
        for(int i = 0; i < windowSize; i++){
            windowSum += cardPoints[i];
        }
        int minSum = windowSum;
        int totalPoints = Arrays.stream(cardPoints).sum();

        for(int i = windowSize; i < cardPoints.length; i++){
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(windowSum,minSum);
        }

        return totalPoints - minSum;
    }
}
