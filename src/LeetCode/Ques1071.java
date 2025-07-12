package LeetCode;

public class Ques1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        String result = gcdOfStrings(str1,str2);
        System.out.println(result);

    }

    public static String gcdOfStrings(String str1, String str2){
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int strlen1 = str1.length();
        int strlen2 = str2.length();

        while (strlen2 != 0) {
            int temp = strlen1 % strlen2;
            strlen1 = strlen2;
            strlen2 = temp;
        }

        return str1.substring(0,strlen1);
    }
}
