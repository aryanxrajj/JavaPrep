package Recursion.Level1Ques;

public class Ques6 {
    public static void main(String[] args) {
        String s = "geeksforgeek";
        System.out.println(UpperCase(s,0));
    }

    public static char UpperCase(String s, int index){
        if(index == s.length()){
            return ' ';
        }

        if(s.charAt(index) >= 'A' && s.charAt(index) <= 'Z'){
            return s.charAt(index);
        }

        return UpperCase(s,index+1);
    }
}
