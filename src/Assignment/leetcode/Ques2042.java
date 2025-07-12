package Assignment.leetcode;

public class Ques2042 {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));

        String s2 = "hello world 5 x 5";
        System.out.println(areNumbersAscending(s2));

        String s3 = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println(areNumbersAscending(s3));
    }

    public static boolean areNumbersAscending(String s) {
        String[] str = s.split(" ");
        int check = Integer.MIN_VALUE;

        for(String i : str){
            if(i.charAt(0) >= '0' && i.charAt(0) <= '9'){
                int num = Integer.parseInt(i);
                if(num > check){
                    check = num;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}
