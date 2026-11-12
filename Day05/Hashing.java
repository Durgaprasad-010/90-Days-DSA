
import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int x = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], count);

            if (count > max) {
                max = count;
                x = nums[i];
            }
            else if (count == max && nums[i] < x) {
                x = nums[i];
            }
        }

        return x;
    }
}
