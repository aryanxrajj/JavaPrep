package LeetCode;

public class Ques2283 {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));

        String num2 = "030";
        System.out.println(digitCount(num2));
    }

    public static boolean digitCount(String num) {
        int[] count = new int[10];

        for(char c : num.toCharArray()){
            count[c - '0']++;
        }

        for(int i = 0; i < num.length();i++){
            int n = num.charAt(i) - '0';
            if(count[i] != n){
                return false;
            }
        }

        return true;
    }
}
