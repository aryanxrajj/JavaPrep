package String;

import java.util.Arrays;

public class CharacterExtraction {
    public static void main(String[] args) {
        //CharAt() Function
        String name  = new String("Paras");
        System.out.println(name.charAt(0));//Output: P

        //getChars() Function
        String name1 = "Hi, My Name is Aryan Raj";
        int start = 2;
        int end = 4;
        char[] buf = new char[4 - 2];
        name.getChars(start,end,buf,0);//Output: Nothing

        //getBytes()
        String name2 = "Aryan";
        byte[] arr = name2.getBytes();
        System.out.println(Arrays.toString(arr));//Output: [65, 114, 121, 97, 110]

        //toCharArray()
        String name3 = "Paras";
        char[] arr1 = name3.toCharArray();
        System.out.println(Arrays.toString(arr1));//Output: [P, a, r, a, s]
    }
}
