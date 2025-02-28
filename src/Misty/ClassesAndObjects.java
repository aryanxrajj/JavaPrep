package Misty;

public class ClassesAndObjects {
    int a;
    int b;

    public ClassesAndObjects(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ClassesAndObjects() {
        a = 0;
        b = 0;
    }

    void display(){
        System.out.println(a + " "+ b);
    }

    public static void main(String[] args) {
        ClassesAndObjects misty = new ClassesAndObjects(10,20);
        misty.display();
        ClassesAndObjects misty2 = new ClassesAndObjects();
        misty2.display();

    }
}
