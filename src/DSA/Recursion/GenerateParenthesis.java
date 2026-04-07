package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n,0,0,result,"");
        return result;
    }

    public static void generate(int n, int opening, int closing, List<String> result, String curr){
        if(curr.length() == 2*n){
            result.add(curr);
            return;
        }

        if(opening < n){
            generate(n,opening + 1, closing, result, curr + "(");
        }

        if(closing < opening){
            generate(n,opening, closing + 1, result, curr + ")");
        }
    }
}
