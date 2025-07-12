package leetcode;

public class Ques2103 {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));

        String rings2 = "B0R0G0R9R0B0G0";
        System.out.println(countPoints(rings2));

        String rings3 = "G4";
        System.out.println(countPoints(rings3));
    }

    public static int countPoints(String rings) {
        int[] red = new int[10];
        int[] blue = new int[10];
        int[] green = new int[10];

        char[] ch = rings.toCharArray();
        int ring = 0, rods = 1;
        while(rods < ch.length){
            if(ch[ring] == 'R'){
                red[ch[rods] - '0']++;
            }else if(ch[ring] == 'B'){
                blue[ch[rods] - '0']++;
            }else{
                green[ch[rods] - '0']++;
            }
            ring+=2;
            rods+=2;
        }

        int count = 0;
        for (int i = 0; i < red.length; i++) {
            if(red[i] >= 1 && blue[i] >= 1 && green[i] >=1){
                count++;
            }
        }

        return count;
    }
}
