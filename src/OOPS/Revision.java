package OOPS;

class Parent{
    void show(){
        System.out.println("Inside Parent Class");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Inside Child Class");
    }
}

public class Revision {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
