package LeetCode;

public class Ques1781 {
    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));
    }

    public static int beautySum(String s) {
        int result = 0;
        for(int i = 0; i < s.length();i++){
            int[] arr = new int[26];
            int max = Integer.MIN_VALUE;
            for(int j = i; j < s.length();j++){
                int index = s.charAt(j) - 'a';
                arr[index]++;
                max = Math.max(max,arr[index]);
                int min = Integer.MAX_VALUE;
                for(int k = 0 ; k < arr.length;k++){
                    if(arr[k] > 0){
                        min = Math.min(arr[k],min);
                    }
                }

                result+=(max - min);
            }
        }

        return result;
    }
}
