package leetcode;

public class Ques1572 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(diagonal(arr));
    }

        static int diagonal(int[][] arr){
            int sum =0;
            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(i==j){
                        sum+=arr[i][j];
                    }
                }
            }
            for(int i =0;i<arr.length;i++){
                int start = 0;
                int end  = arr[0].length-1;

                while(start<end){
                    int temp = arr[i][start];
                    arr[i][start] = arr[i][end];
                    arr[i][end] = temp;
                    start++;
                    end--;
                }
            }


            for(int i =0;i<arr.length;i++){
                for(int j =0;j<arr[i].length;j++) {
                    if(i==j){
                        sum+=arr[i][j];
                    }
                }
            }
            int n = arr.length;
            if(n%2!=0){
                sum-=arr[n/2][n/2];
                return sum;

            }
            return sum;
        }

}
