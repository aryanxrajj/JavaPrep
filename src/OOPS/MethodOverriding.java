package OOPS;

class A1 {
    int i ,j;

    public A1(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.println("i and j: "+i+" "+j);
    }

    void showdiff(){
        System.out.println("i and j: "+i+" "+j);
    }
}

class B1 extends A1{
    int k;

    public B1(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show(){
        super.show();
        System.out.println("k: is "+k);
    }

    void show(String msg){
        System.out.println(msg+k);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B1 b1 = new B1(1,2,3);
        b1.show();

        B1 b2 = new B1(4,5,6);
        b2.show("The k is : ");
        b2.show();
    }
}
