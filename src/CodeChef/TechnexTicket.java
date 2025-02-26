package CodeChef;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TechnexTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test_cases = input.nextInt();

        while(test_cases-- > 0){
            int x = input.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 1; i <= 1200; i++){
                arr.add(i);
            }
            int count_second = 0;
            int i = 0,j = 2;
            while(true){
                if(x == arr.get(i)){
                    count_second++;
                    break;
                }
                arr.remove(i);
                arr.remove(j);
            }

            System.out.println(count_second);
        }
    }
}
