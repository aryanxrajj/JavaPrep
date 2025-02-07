package CodeChef;

import java.util.*;

public class AveragePermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Test_case = input.nextInt();
        while(Test_case-- > 0){
            int n = input.nextInt();
            List<Integer> list = new ArrayList<>();
            if(n%2==0){
                for(int i=1;i<=n;i++){
                    list.add(i);
                }
                Collections.swap(list,n-2,0);
            }else{
                for(int i=n;i>=1;i--){
                    list.add(i);
                }
            }

            for(int num: list){
                System.out.print(num+" ");
            }

            System.out.println();

        }


    }
}
