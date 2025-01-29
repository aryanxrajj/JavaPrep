package OOPS;

class Test{
    int a;
    int b;

    public Test() {
        this(10,20);
        System.out.println("Inside the default Constructor");
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside the parameterized Constructor");
    }
}

class Test2{
    int a;
    int b;

    public Test2() {
        a = 10;
        b = 20;
    }

//    Test get(){return this;}
}

public class ThisKeyword {
    public static void main(String[] args) {
        Test test = new Test();

    }
}
