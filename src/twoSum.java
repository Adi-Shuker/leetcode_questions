import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <2 || nums.length > Math.pow(2,10) || target < Math.pow(-10, 9) || target > Math.pow(10,9)){
            return null;
        }
        Map<Integer, Integer > numsMap = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(nums[i] <Math.pow(-10,9)|| nums[i] > Math.pow(10,9)){
                continue;
            }
            if(numsMap.containsKey(target-nums[i])){
                return new int[] {i, numsMap.get(target-nums[i])};
            }else{
                numsMap.put(nums[i], i);
            }
        }
        return null;
    }
}
