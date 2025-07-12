package CodeChef;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class ReversingDirections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test_cases = input.nextInt();

        while(test_cases-- > 0){
            int n = input.nextInt();
            input.nextLine();
            Stack<String> directions = new Stack<>();
            Stack<String> road = new Stack<>();

            for(int i = 0;i < n ;i++){
                String s = input.nextLine();
                if(s.startsWith("Begin")){
                    directions.push(s.substring(0,5));
                    road.push(s.substring(5,s.length()));
                }else if(s.startsWith("Right")){
                    directions.push(s.substring(0,5));
                    road.push(s.substring(5,s.length()));
                }else if(s.startsWith("Left")){
                    directions.push(s.substring(0,4));
                    road.push(s.substring(4,s.length()));
                }
            }

            System.out.println("Begin on" + road.pop());

            while(!road.isEmpty()){
                if(Objects.equals(directions.pop(), "Left")){
                    System.out.println("Right"+road.pop());
                }else{
                    System.out.println("Left"+road.pop());
                }
            }

        }
    }
}
