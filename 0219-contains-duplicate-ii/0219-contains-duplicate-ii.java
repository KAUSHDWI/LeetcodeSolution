import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Step 1: check duplicate
            if (set.contains(nums[i])) {
                return true;
            }

            // Step 2: add element
            set.add(nums[i]);

            // Step 3: maintain window size k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}