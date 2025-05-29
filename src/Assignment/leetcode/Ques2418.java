package Assignment.leetcode;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Ques2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < heights.length; i++){
            map.put(heights[i],map.getOrDefault(heights[i],i));
        }

        Integer[] sortedHeights = new Integer[heights.length];
        for(int i = 0; i < heights.length; i++){
            sortedHeights[i] = heights[i];
        }
        Arrays.sort(sortedHeights,Collections.reverseOrder());

        String[] result = new String[names.length];
        int j = 0;
        for(int i : sortedHeights){
            int index = map.get(i);
            result[j++] = names[index];

        }

        return result;
    }
}
