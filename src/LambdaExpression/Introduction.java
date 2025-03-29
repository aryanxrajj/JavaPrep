package LambdaExpression;

import java.util.function.Predicate;

//Functional Interface
interface MyNumber{
    double getValue();
}

interface MyNumber1{
    boolean isEven(int n);
}

public class Introduction {
    public static void main(String[] args) {
        MyNumber mynum;
        mynum = () -> 123.45;
        System.out.println(mynum.getValue());
        MyNumber1 mynum1;
        mynum1 = (n) -> n % 2 == 0;
        System.out.println(mynum1.isEven(10));
        Predicate<Integer> result = (n) -> n % 2 == 0;
        System.out.println(result.test(5));
    }
}
