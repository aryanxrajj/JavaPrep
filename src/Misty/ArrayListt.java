package Misty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(int i=0;i<5;i++){
            arr.add(input.nextInt());
        }
        arr.set(4,14);
        arr.remove(4);

        System.out.println(arr+" ");

         boolean check = arr.contains(20);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
