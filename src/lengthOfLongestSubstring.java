import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int longestStreak =0;
        int currentMax = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0 ; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                currentMax = i - map.get(s.charAt(i));
                int j=0;
                while(j<map.get(s.charAt(i))){
                    if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) == j){
                        map.remove(s.charAt(j));
                    }
                    j++;
                }
                map.put(s.charAt(i), i);
            }else{
                map.put(s.charAt(i),i);
                currentMax++;
                if(currentMax > longestStreak ){
                    longestStreak = currentMax;
                }
            }
        }
        return longestStreak;
    }
}
