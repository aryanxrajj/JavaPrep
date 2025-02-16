package Assignment.leetcode;

public class Ques345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));

    }

    public static String reverseVowels(String s) {
        char[] vowels = s.toCharArray();
        String Vowels = "AEIOUaieou";
        int start = 0,end = vowels.length-1;

        while(start < end){
            char chstarts = vowels[start];
            char chends = vowels[end];
            if(Vowels.indexOf(chstarts) != -1 && Vowels.indexOf(chends) != -1){
                swap(vowels,start,end);
                start++;
                end--;
            }else if(Vowels.indexOf(chstarts) == -1){
                start++;
            }else if(Vowels.indexOf(chends) == -1){
                end--;
            }
        }
        String result = new String(vowels);
        return result;
    }

    private static void swap(char[] vowels, int first, int second) {
        char temp = vowels[first];
        vowels[first] = vowels[second];
        vowels[second] = temp;
    }
}
