package LeetCode;

public class Ques258 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
        System.out.println(addDigitsRec(num));
        int num2 = 0;
        System.out.println(addDigits(num2));
        System.out.println(addDigitsRec(num2));
    }

    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        int sum = num, res = 0;
        while(true){
            while(sum != 0){
                int rem = sum % 10;
                res+=rem;
                sum/=10;
            }
            sum = res;
            if(res < 10){
                break;
            }
            res = 0;
        }
        return res;
    }

    //Using Recursion
    public static int addDigitsRec(int num){
        if(num < 10){
            return num;
        }

        int res = 0;
        while(num!=0){
            int rem = num%10;
            res+=rem;
            num/=10;
        }

        return addDigits(res);
    }
}
