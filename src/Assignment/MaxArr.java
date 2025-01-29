package Assignment;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,9,6,5};

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(maxrangearr(arr,1,5));
    }

    static int maxrangearr(int[] arr,int start,int end){
        int max = arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
