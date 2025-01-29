package Lectures;

import com.sun.security.jgss.GSSUtil;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a);//Converting int to integer explicitly.
        System.out.println(b);

        Integer c = a;//Compiler automatically convert int to Integer it is also called autoboxing.

        int e = b.intValue();//Converting Integer to int explicitly;
        int d = c;//this is called unboxing opposite of autoboxing.
//        boolean j;
//        System.out.println(j);
    }
}
