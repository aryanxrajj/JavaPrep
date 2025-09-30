package DSA.Graph.UndirectedGraph;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int V = 4;
        int[][] mat = new int[V][V];

        addEdge(mat,0,1);
        addEdge(mat,0,2);
        addEdge(mat,1,2);
        addEdge(mat,2,3);
        addEdge(mat,1,3);

        display(mat);
    }

    public static void addEdge(int[][] mat,int i , int j){
        mat[i][j] = 1;
        mat[j][i] = 1;
    }

    public static void display(int[][] mat){
        for(int[] row : mat){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
