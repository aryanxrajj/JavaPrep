package LeetCode;

import java.util.*;

public class Ques127 {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");

        System.out.println(ladderLength(beginWord,endWord,wordList));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        if(!wordList.contains(endWord)) return 0;

        HashSet<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        set.add(beginWord);

        int steps = 1;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                String curr = queue.poll();
                if(Objects.equals(curr, endWord)) return steps;

                for(String list : neighbors(curr,wordSet)){
                    if(!set.contains(list)){
                        set.add(list);
                        queue.offer(list);
                    }
                }
            }
            steps++;
        }

        return 0;
    }

    public static List<String> neighbors(String word, HashSet<String> set){
        List<String> res = new ArrayList<>();
        char[] chars = word.toCharArray();

        for(int i = 0; i < word.length(); i++){
            char original = chars[i];
            for(char c = 'a'; c <= 'z'; c++){
                if(original == c) continue;
                chars[i] = c;
                String newWord = new String(chars);
                if(set.contains(newWord)) res.add(newWord);
            }
            chars[i] = original;
        }

        return res;
    }

}
