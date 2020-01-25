package TwoSum_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {22, 17, 11, 7, 2};
        int target = 9;

        int[] res = s.twoSum(nums, target);

        System.out.println("Result:\n" + Arrays.toString(res));
    }
}
