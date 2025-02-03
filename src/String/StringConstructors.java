package String;

public class StringConstructors {
    public static void main(String[] args) {
        char[] ch = {'J','A','V','A'};
        String name = new String(ch);//Passing character array as parameter

        System.out.println(name);//Output: JAVA

        String name1 = new String(ch,1,3);//passing offset and count to call the constructor.
        System.out.println(name1);
    }
}
