package Lectures;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {

    public static void main(String[] args) {
        new Scanner(System.in);
        var(1, 3, 4, 5, 6, 6);
    }

    static void var(int... v) {
        System.out.println(Arrays.toString(v));
    }
}