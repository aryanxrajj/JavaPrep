package LeetCode;

public class Ques2210 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,1,6,5};
        System.out.println(countHillValley(arr));
    }

    public static int countHillValley(int[] arr) {
        int count = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            int left = -1, right = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] != arr[i]) {
                    left = arr[j];
                    break;
                }
            }

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] != arr[i]) {
                    right = arr[k];
                    break;
                }
            }

            if (left != -1 && right != -1) {
                count++;
            }
        }

        return count;
    }
}
