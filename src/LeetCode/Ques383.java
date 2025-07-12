package LeetCode;

public class Ques383 {
    public static void main(String[] args) {
        String rn = "a";
        String mag = "b";
        System.out.println(canConstruct(rn,mag));

        String rn2 = "aa";
        String mag2 = "ab";
        System.out.println(canConstruct(rn2,mag2));

        String rn3 = "aa";
        String mag3 = "aab";
        System.out.println(canConstruct(rn3,mag3));


    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            mag[magazine.charAt(i) - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(mag[c - 'a'] == 0){
                return false;
            }else{
                mag[c - 'a']--;
            }
        }

        return true;
    }
}
