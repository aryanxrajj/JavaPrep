package Assignment.leetcode;

public class Ques69 {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int count = 0;
        int i = 1;
        while(x>=i){
            x-=i;
            i+=2;
            count++;
        }
        return count;
    }
}
