package Assignment;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
            if(i%3==0&&i%5==1){
                System.out.println("Fizz");
            }
            if(i%3==1&&i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
