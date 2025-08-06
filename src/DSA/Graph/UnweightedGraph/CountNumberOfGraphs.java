package DSA.Graph.UnweightedGraph;

public class CountNumberOfGraphs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countGraph(n));
    }

    public static long countGraph(int n){
        //Maximum Number Edges with n vertices
        long x = (long) n * (n - 1) / 2;
        return (long) Math.pow(2,x);
    }
}
