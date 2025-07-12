package leetcode;

public class Ques2011 {
    public static void main(String[] args) {
        String[] operation = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operation));

        String[] operation2 = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operation2));

        String[] operation3 = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operation3));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;

        for(String s : operations){
            if(s.equals("++X") || s.equals("X++")){
                count++;
            }

            if(s.equals("--X") || s.equals("X--")){
                count--;
            }
        }

        return count;
    }
}
