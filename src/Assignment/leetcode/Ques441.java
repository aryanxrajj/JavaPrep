package Assignment.leetcode;

public class Ques441 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));

    }

    static int arrangeCoins(int total) {
        int level = 0, coin = 1;
        while (total >= coin) {
            total -= coin;
            coin++;
            level++;
        }
        return level;

    }
}
