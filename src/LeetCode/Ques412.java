package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ques412 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzBuzz(n));

        int n2 = 5;
        System.out.println(fizzBuzz(n2));

        int n3 = 15;
        System.out.println(fizzBuzz(n3));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            }else if(i % 3 == 0){
                result.add("Fizz");
            }else if(i % 5 == 0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
