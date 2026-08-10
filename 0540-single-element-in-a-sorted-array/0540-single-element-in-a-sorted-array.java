class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct: mid and mid+1
            if (nums[mid] == nums[mid + 1]) {
                // Single element is on the right
                l = mid + 2;
            } else {
                // Single element is on the left
                r = mid;
            }
        }

        return nums[l];
    }
}