package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i =0;i<n;i++){
            int count = 1;
            for(int j=0;j<n-i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
