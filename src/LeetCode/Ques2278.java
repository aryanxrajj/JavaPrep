package leetcode;

public class Ques2278 {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';

        System.out.println(percentageLetter(s,letter));
    }

    public static int  percentageLetter(String s, char letter) {
        double count = 0;
        for(char c : s.toCharArray()){
            if(c == letter){
                count++;
            }
        }

        double length = s.length();
        double result = count/length * 100;

        return (int)(result);
    }
}
