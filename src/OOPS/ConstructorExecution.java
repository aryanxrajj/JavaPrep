package OOPS;

class A {
    public A() {
        System.out.println("Inside's A Constructor");
    }
}

class B extends A{
    public B() {
        System.out.println("Inside's B Constructor");
    }
}

class C extends B{
    public C() {
        System.out.println("Inside's C Constructor");
    }
}

public class ConstructorExecution {
    public static void main(String[] args) {
        C c = new C();
    }
}
