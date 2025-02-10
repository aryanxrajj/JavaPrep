package Codeforeces;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        while(n-- > 0){
            String name = input.nextLine();
            StringBuilder result = new StringBuilder();
            if(name.length() > 2) {
                for (int i = 0; i < name.length() - 2; i++) {
                    result.append(name.charAt(i));
                }
                result.append("i");
            }else{
                result.append("i");
            }

            System.out.println(result.toString());
        }


    }
}
