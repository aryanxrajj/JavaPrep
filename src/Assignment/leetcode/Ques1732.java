package Assignment.leetcode;

public class Ques1732 {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(nums));
    }

    static int largestAltitude(int[] gain) {
        int netGain = 0;
        int altitude = 0;
        for(int i = 0;i<gain.length;i++){
            netGain+=gain[i];
            if(netGain>altitude){
                altitude = netGain;
            }
        }

        return altitude;

    }
}
