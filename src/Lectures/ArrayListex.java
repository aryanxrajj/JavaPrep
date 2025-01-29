package Lectures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> arr = new ArrayList<Integer>(10 );
        arr.add(10);// adding item to the arrayList
        arr.add(20);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        boolean check = arr.contains(20);// whether the arraylist contains the element or not;
        arr.set(1,10);
        arr.remove(4);
        System.out.print(arr+" ");
        System.out.println(check);

        for(int i=0;i<5;i++){
            arr.add(input.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(arr.get(i));
        }


    }
}
