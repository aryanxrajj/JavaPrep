package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
