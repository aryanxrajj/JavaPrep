package DSA.SubArrayTechniques;

import java.util.HashMap;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(subarraysumdivisiblebyk(arr,k));
    }

    public static int subarraysumdivisiblebyk(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1); //empty prefix

        int prefix = 0;
        for(int x : arr){
            prefix += x;
            int rem = ((prefix % k) + k) % k; //znormalize the remainder to handle negative values
            int seen = map.getOrDefault(rem,0);
            count += seen;
            map.put(rem,seen + 1);
        }

        return count;
    }
}
