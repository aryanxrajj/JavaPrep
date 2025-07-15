package DSA.SubArrayTechniques;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSum(arr));
    }

    public static int MaximumSum(int[] arr){
        int currentMax = arr[0], maxSoFar = arr[0];

        for(int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(currentMax,maxSoFar);
        }

        return maxSoFar;
    }
}
