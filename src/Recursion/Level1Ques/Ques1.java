package Recursion.Level1Ques;

public class Ques1 {
    public static void main(String[] args) {
        printreverse(1);
    }

    //Printing Reverse Number through Recursion
    public static void printreverse(int n){
        if(n == 10){
            System.out.println(10);
            return;
        }

        printreverse(n+1);
        System.out.println(n);
    }
}
