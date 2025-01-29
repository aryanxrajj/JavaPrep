package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }
}
