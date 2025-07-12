package Misty;

public class BasicsRecursion {
    public static void main(String[] args) {
//        print1(1);
//        rec(1);
//        System.out.println(sumo(5,0));
        System.out.println(sumo2(5));
    }

    public static void rec(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        rec(n+1);
        System.out.println(n);
    }

    public static void print1(int n){
        System.out.println(n);
        print2(n+1);
    }

    public static void print2(int n){
        System.out.println(n);
        print3(n+1);
    }

    public static void print3(int n){
        System.out.println(n);

    }

    //Type 1
    public static int sumo(int n, int sum){
        if(n == 0){
            return sum;
        }

        sum+=n;
        return sumo(n-1,sum);
    }

    public static int sumo2(int n){
        if( n == 1){
            return n;
        }

        return n + sumo2(n-1);
    }
}
