package Assignment.leetcode;

public class Ques744 {
    public static void main(String[] args) {
        char[] ch = {'c','f','j'};
        char ch2 = 'd';
        System.out.println(find(ch,ch2));

    }

    static char find(char[] letters, char target){
        int start = 0 ;
        int end = letters.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start% letters.length];
    }
}
