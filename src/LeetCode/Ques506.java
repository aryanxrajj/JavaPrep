package LeetCode;

import java.util.*;

public class Ques506 {
    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));

        int[] score2 = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score2)));
    }

    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        String[] medals = {"Gold Medal","Silver Medal","Bronze Medal"};

        for(int i : score){
            queue.add(i);
        }

        HashMap<Integer,String> map = new HashMap<>();

        for(int i = 0; i < score.length; i++){
            int n = queue.poll();
            if(i < 3){
                map.put(n,medals[i]);
            }else{
                map.put(n,String.valueOf(i+1));
            }
        }

        String[] result = new String[score.length];
        for(int i = 0; i < score.length; i++){
            result[i] = map.get(score[i]);
        }

        return result;
    }
}
