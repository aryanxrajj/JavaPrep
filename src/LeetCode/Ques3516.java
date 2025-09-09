package LeetCode;

public class Ques3516 {
    public static void main(String[] args) {
        int x = 2, y = 7, z = 4;
        System.out.println(findClosest(x,y,z));
    }

    public static int findClosest(int x, int y, int z) {
        int find1 = Math.abs(x - z);
        int find2 = Math.abs(y - z);

        if(find1 < find2){
            return 1;
        }else if(find2 < find1){
            return 2;
        }

        return 0;
    }
}
