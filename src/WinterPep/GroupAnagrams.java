package WinterPep;
import java.util.List;
import java.util.ArrayList;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> res = groupAnagrams(strs);
        for(List<String> list : res){
            System.out.println(list);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] track = new boolean[strs.length];

        for(int i = 0; i < strs.length; i++){
            if(track[i]) continue;
            List<String> list = new ArrayList<>();
            String curr = strs[i];
            list.add(curr);
            track[i] = true;
            for(int j = 0 ;j < strs.length; j++){
                if(curr.length() == strs[j].length() && !track[j]){
                    String check = strs[j];
                    int[] frequency = new int[26];
                    for(int k = 0; k < curr.length(); k++){
                        frequency[curr.charAt(k) - 'a']++;
                        frequency[check.charAt(k) - 'a']--;
                    }

                    boolean partAnagram = true;
                    for(int x : frequency){
                        if (x != 0) {
                            partAnagram = false;
                            break;
                        }
                    }

                    if(partAnagram) {
                        list.add(check);
                        track[j] = true;
                    }
                }
            }

            result.add(list);
        }

        return result;
    }
}
