class Solution {
    public int majorityElement(int[] nums) {
        //BF
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}