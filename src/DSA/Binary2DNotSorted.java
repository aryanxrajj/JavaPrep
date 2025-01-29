package DSA;

import java.util.Arrays;

public class Binary2DNotSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(matrix,1)));
    }

    static int[] search(int[][] matrix, int target){
        int row = matrix.length-1;
        int cs = 0;
        int ce = matrix[0].length-1;

        int rstart = 0;
        int rend = row;
        int cmid = cs + (ce-cs)/2;

        while(rstart<(rend-1)){
            if(row==0){
                binarySearch(matrix,cs,ce,row,target);
            }
            int mid = rstart + (rend-rstart)/2;
            if(matrix[mid][cmid]<target){
                rstart = mid;
            }else{
                rend = mid;
            }
        }
        if((matrix[rstart][cs]<=target && matrix[rstart][ce]>=target)){
            return binarySearch(matrix, cs, ce, rstart, target);
        }else{
            return binarySearch(matrix, cs, ce, rstart+1, target);
        }

    }

    static int[] binarySearch(int[][] matrix,int cs,int ce,int row,int target){
        while(cs<=ce){
            int mid = cs + (ce-cs)/2;
            if(target==matrix[row][mid]){
                return new int[]{row,mid};
            }
            if(target>matrix[row][mid]){
                cs = mid+1;
            }else{
                ce = mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
