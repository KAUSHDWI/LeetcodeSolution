import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);  //  sort the array
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {  // check neighbors
                return nums[i];
            }
        }
        
        return -1; // duplicate always exists
    }
}