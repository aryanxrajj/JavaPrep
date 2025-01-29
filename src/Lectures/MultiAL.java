package Lectures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MultiAL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        String b = input.nextLine();
        //declaration
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();// here arrayList is empty
        //initialisation
        for(int i=0;i<3;i++){
            arr.add(new ArrayList<>());
        }
        //adding elements
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr.get(i).add(input.nextInt());
            }
        }

        System.out.println(arr);

    }
}
