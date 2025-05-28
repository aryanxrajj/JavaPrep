package Lectures;

public class StringAndStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb.compareTo(sb2) == 0);

    }
}
