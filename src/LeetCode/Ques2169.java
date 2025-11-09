package LeetCode;

public class Ques2169 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;
        System.out.println(countOperations(num1,num2));
    }

    public static int countOperations(int num1, int num2) {
        int count = 0;

        while(num1 != 0 && num2 != 0){
            if(num1 >= num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }

            count++;
        }

        return count;
    }
}
