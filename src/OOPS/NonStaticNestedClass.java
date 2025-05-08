package OOPS;

class Paras{
    static int a = 10;
    static class anything{
        static void display(){
            System.out.println("inside anything");
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        anything.display();
    }
}


public class NonStaticNestedClass {
    public static void main(String[] args) {
        Paras p = new Paras();

    }
}
