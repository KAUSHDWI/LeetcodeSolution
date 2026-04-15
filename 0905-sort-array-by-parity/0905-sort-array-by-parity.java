class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0; // position for next even number

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                // swap nums[i] with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++; // move even position forward
            }
        }
        return nums;
    }
}