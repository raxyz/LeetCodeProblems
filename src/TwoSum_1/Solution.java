package TwoSum_1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[i] == (target - nums[j])) {
                    return new int[]{i, j};
                }
            }
        }

//        Faster method
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//
//            int d = target - nums[i];
//            if (map.containsKey(d) && map.get(d) != i) {
//                return new int[]{map.get(d), i};
//            }
//
//            map.put(nums[i], i);
//        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
