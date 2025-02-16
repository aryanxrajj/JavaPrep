package CodeChef;

import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test_cases = input.nextInt();

        while(test_cases-- > 0){
            int n = input.nextInt();
            int k = input.nextInt();
            int remaining = 0;
            boolean possible = true;
            for(int i = 1;i<=n;i++){
                int x = input.nextInt();
                if(x+remaining < k){
                    System.out.println("NO "+ i);
                    possible = false;
                    while(i < n){
                        input.nextInt();
                        i++;
                    }
                    break;
                }
                remaining = (x+remaining) - k;
            }
            if(possible){
                System.out.println("YES");
            }
        }
        input.close();
    }
}
