package DSA.BitManipulation;

import java.util.Arrays;

public class BinaryConversion {
    public static void main(String[] args) {
        int num = 4;
        binaryConversion(num);
    }

    public static void binaryConversion(int num){
        // we can use 32 also, but for safer not to overflow integers we use 35.
        int[] binary = new int[35];
        int i = 0;

        while(num > 0){
            binary[i++] = num % 2;
            num = num / 2;
        }

        int[] result = Arrays.copyOfRange(binary,0, i);

        for(int j = result.length - 1; j >= 0; j--){
            System.out.print(result[j] + " ");
        }
    }
}
