import java.util.HashMap;
import java.util.Map;

public class getMaxLengthStreakOfWinningNumbers {
    public static int getMaxLengthStreakOfWinningNumbers(int[] numbers_array)
    {
        if(numbers_array == null || numbers_array.length == 0){
            return 0;
        }
        int longestStreak =0;
        int currentMax = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i< numbers_array.length; i++){
            if(map.containsKey(numbers_array[i])){
                int j=0;
                while(j<map.get(numbers_array[i])){
                    if(map.containsKey(numbers_array[i]) && map.get(numbers_array[i]) == j){
                        map.remove(numbers_array[i]);
                    }
                    j++;
                }
                currentMax = i - map.get(numbers_array[i]);
                map.put(numbers_array[i], i);
            }else{
                map.put(numbers_array[i],i);
                currentMax++;
                if(currentMax > longestStreak ){
                    longestStreak = currentMax;
                }
            }
        }
        return longestStreak;
    }
}
