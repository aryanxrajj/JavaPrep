package WinterPep.Operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        /*
        1. And Operator
        2. OR Operator
        3. XOR Operator
        4. NOT Operator
        5. Left Shift Operator
        6. Right Shift Operator
         */

        int a = 5, b = 6;
        int c = ~a;
        System.out.println(a & b); // And Operation
        System.out.println(a | b); // Or Operation
        System.out.println(a ^ b); // XOR Operation
        System.out.println(c); // -(n+1) formula for not operator
        int d = 8, e = 2;
        System.out.println(d << e); // N * 2^No of Shift
        System.out.println(d >> e); // N / 2^No of Shift
    }
}
