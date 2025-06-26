package Recursion.Level3Ques;

import java.util.ArrayList;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        SubSeq("","abc");
        System.out.println(SubSeqRet("","abc"));
    }
    //Directly Printing
    public static void SubSeq(String p, String s){
        if(s.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = s.charAt(0);

        SubSeq(p + ch, s.substring(1));
        SubSeq(p,s.substring(1));
    }
    //Storing into the ArrayList
    public static List<String> SubSeqRet(String p, String s){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = s.charAt(0);

        List<String> left = SubSeqRet(p,s.substring(1));
        List<String> right= SubSeqRet(p + ch,s.substring(1));

        left.addAll(right);
        return left;
    }
}
