package Assignment.GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class HittBullsEyeQuestion {
    public static void main(String[] args) {
        String s = "EnjoyYourCoffee";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);

        ArrayList<Character> ch = new ArrayList<>();
        for(char c : s.toCharArray()){
            ch.add(c);
        }

        for(int i = 0; i < list.size(); i++){
            ch.add(list.get(i),' ');
        }

        StringBuilder sb = new StringBuilder();
        for(char x : ch){
            sb.append(x);
        }

        System.out.println(sb.toString());
    }
}
