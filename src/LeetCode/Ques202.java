package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Ques202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));

        int n2 = 2;
        System.out.println(isHappy(n2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(!set.contains(n)){
            set.add(n);
            n = getNext(n);
            if(n == 1){
                return true;
            }
        }

        return false;
    }

    public static int getNext(int n) {
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}
