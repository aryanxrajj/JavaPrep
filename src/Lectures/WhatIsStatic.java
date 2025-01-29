package Lectures;

import com.sun.tools.javac.Main;

public class WhatIsStatic {
    public static void main(String[] args) {

    }

    static void fun(){
        //greeting();// you can not use the not static method inside the static method
        //because it requires a instance and the function you are using not requires any instances.

        //hence , I am referencing it here.
        WhatIsStatic obj = new WhatIsStatic();
        obj.greeting();
    }

    void greeting(){
        System.out.println("Hi my is aryan raj");
    }
}
