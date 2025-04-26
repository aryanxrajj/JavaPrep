package Assignment.leetcode;

public class Ques2315 {
    public static void main(String[] args){
        String s = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s) {
        boolean insidePipe = false;
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                insidePipe = !insidePipe;
            }

            if(!insidePipe && s.charAt(i) == '*'){
                count++;
            }
        }

        return count;
    }
}
