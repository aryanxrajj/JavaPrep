package LeetCode;

public class Ques2287 {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        System.out.println(rearrangeCharacters(s,target));

        String s2 = "abcba";
        String target2 = "abc";
        System.out.println(rearrangeCharacters(s2,target2));

        String s3 = "abbaccaddaeea";
        String target3 = "aaaaa";
        System.out.println(rearrangeCharacters(s3,target3));
    }

    public static int rearrangeCharacters(String s, String target) {
        int[] count = new int[26];

        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        int total = 0;

        while(true){
            boolean flag = false;
            for(int i = 0; i < target.length();i++){
                if(count[target.charAt(i) - 'a'] == 0){
                    flag = true;
                    break;
                }else{
                    count[target.charAt(i) - 'a']--;
                }
            }
            if(flag){
                break;
            }
            total++;
        }

        return total;
    }
}
