package Recursion.Level2Ques;

//Recursion Subset, Subsequence, String Questions
public class Ques3 {
    public static void main(String[] args) {
        String s = "baacadh";
        RemoveA("",s);
        System.out.println(RemoveAString(s));
        System.out.println(removeApple("bcappledah"));
        System.out.println(removeAppNotApple("bcappdah"));
    }
    //Through passing extra parameter
    public static void RemoveA(String result,String s){
        if(s.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch = s.charAt(0);

        if(ch ==  'a'){
            RemoveA(result,s.substring(1));
        }else{
            RemoveA(result + ch, s.substring(1));
        }
    }
    //Without Passing Extra Argument
    public static String RemoveAString(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if(ch ==  'a'){
            return RemoveAString(s.substring(1));
        }else{
            return ch + RemoveAString(s.substring(1));
        }
    }
    //Remove apple in the String
    public static String removeApple(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if(s.startsWith("apple")){
            return removeApple(s.substring(5));
        }else{
            return ch + removeApple(s.substring(1));
        }
    }

    //Remove app if it is not apple.
    public static String removeAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if(s.startsWith("app") && !s.startsWith("apple")){
            return removeAppNotApple(s.substring(3));
        }else{
            return ch + removeAppNotApple(s.substring(1));
        }
    }
}
