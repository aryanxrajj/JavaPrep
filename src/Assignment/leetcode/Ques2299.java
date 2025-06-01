package Assignment.leetcode;

public class Ques2299 {
    public static void main(String[] args) {
        String password = "IloveLe3tcode!";
        System.out.println(strongPasswordCheckerII(password));

        String password2 = "Me+You--IsMyDream";
        System.out.println(strongPasswordCheckerII(password2));

        String password3 = "1aB!";
        System.out.println(strongPasswordCheckerII(password3));
    }

    public static boolean strongPasswordCheckerII(String password) {
        if(password.length() < 7){
            return false;
        }

        boolean upper = false,lower = false,digit= false,sc = false;
        char continous = ' ';
        String specialCharacters = "!@#$%^&*()-+";
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(continous == ch){
                return false;
            }

            continous = ch;

            if(ch >= 'A' && ch <= 'Z'){
                upper = true;
            }
            if(ch >= 'a' && ch <= 'z'){
                lower = true;
            }

            if(Character.isDigit(ch)){
                digit = true;
            }
            if(specialCharacters.contains(String.valueOf(ch))){
                sc = true;
            }
        }

        return upper && lower && digit && sc;
    }
}
