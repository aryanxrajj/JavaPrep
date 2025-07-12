package PEP;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Hanoi(3,1,2,3);
    }

    public static void Hanoi(int n, int from_rod, int to_rod, int aux_rod){
        if(n == 0){
            return;
        }

        Hanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                + from_rod + " to rod "
                + to_rod);
        Hanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
