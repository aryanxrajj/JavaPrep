package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n) {
        for(int i=1;i<=n;i++){
            int count = 1;
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
