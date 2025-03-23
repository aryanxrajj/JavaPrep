package OOPS;

//Basic Nested Class
class Outer{
    static class nested{
        void display(){
            System.out.println("hihihihihihi");
        }
    }
}

//Accessing the Outer Class Static Member
class Outer1{
    static String message = "bye";
    static class nested1{
        void showmessage(){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        nested1 nested = new nested1();
        nested.showmessage();
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.nested obj = new Outer.nested();
        obj.display();

    }
}
