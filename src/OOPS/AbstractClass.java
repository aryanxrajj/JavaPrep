package OOPS;

abstract class aryan{
     abstract void callme();//Abstract method without body

     void callmetoo(){//regular body
         System.out.println("This is concrete method");
    }
}

class paras extends aryan{
    void callme(){//
        System.out.println("Paras implementation of call me");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        aryan Aryan = new paras();//making object of paras but refering to aryan class.
        Aryan.callme();
        Aryan.callmetoo();
    }
}
