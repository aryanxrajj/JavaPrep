package Assignment.leetcode;

public class Ques1295 {
    public static void main(String[] args) {
        int[] arr = {14,299,23,90,234};
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] arr){
        int ans =0,count=0;
        for(int i=0;i< arr.length;i++){
            while(arr[i]!=0){
                arr[i]/=10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
            count=0;

        }
        return ans;
    }
}
