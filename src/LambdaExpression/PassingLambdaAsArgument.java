package LambdaExpression;

interface isEven{
    boolean check(int n);
}
public class PassingLambdaAsArgument {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(isEvenOperation(n1 -> n1  % 2 == 0, n));
    }

    public static boolean isEvenOperation(isEven even , int n){
        return even.check(n);
    }
}
