package LeetCode;

public class Ques551 {
    public static void main(String[] args) {
        String s  = "PPALLP";
        System.out.println(checkRecord(s));

        String s1 = "PPALLL";
        System.out.println(checkRecord(s1));
    }

    public static boolean checkRecord(String s) {
        int aCount = 0, lCount = 0, pCount = 0;

        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                aCount++;
                lCount = 0;
            }

            if(s.charAt(i) == 'P'){
                pCount++;
                lCount = 0;
            }

            if(s.charAt(i) == 'L'){
                lCount++;
            }

            if(lCount == 3){
                return false;
            }
        }

        return aCount < 2;
    }
}
