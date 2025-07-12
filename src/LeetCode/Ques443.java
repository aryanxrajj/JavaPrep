package leetcode;

public class Ques443 {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println(result);
        for(int i = 0;i< result;i++){
            System.out.print(chars[i] + " ");
        }
    }

    public static int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }

        int index = 0;
        int i = 0;

        while(i < chars.length){
            char curr = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == curr){
                i++;
                count++;
            }

            chars[index++]  = curr;

            if(count > 1) {
                for (char a : String.valueOf(count).toCharArray()) {
                    chars[index++] = a;
                }
            }
        }

        return index;

    }
}
