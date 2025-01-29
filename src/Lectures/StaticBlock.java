package Lectures;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in the static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a +" "+obj.b);

        obj.b+=3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(obj.a+" "+obj.b);
    }
}
