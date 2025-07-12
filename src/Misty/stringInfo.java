package Misty;

import java.sql.SQLOutput;

public class stringInfo {
    public static void main(String[] args) {
        char[] ch = {'m', 'i', 's', 't', 'y'};
        byte[] ch1 = {65, 66, 67, 68, 69};
        String name = new String(ch, 0, 3);
        String byte1 = new String(ch1);
        System.out.println(byte1);
        System.out.println(name);

        //Character Extraction

        String demo1 = new String("misty");
        char at0 = demo1.charAt(0);
        char at1 = demo1.charAt(1);

        System.out.println(at0 + " " + at1);
        System.out.println(demo1.toCharArray());

        String hello = "hello";
        String Hello = "HELLO";

        System.out.println(hello.equals(Hello));
        System.out.println(hello.equalsIgnoreCase(Hello));

        System.out.println(demo1.indexOf("z "));

        String name5 = "misty";
        name5 = "aryan";
        System.out.println(name5);




    }
}
