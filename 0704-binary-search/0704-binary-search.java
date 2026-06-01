class Solution {
    public int search(int[] nums, int target) {
    return recursion(nums, 0, nums.length-1, target);
    }

    static int recursion(int[] nums, int low, int high, int target){

        if(low > high){
            return -1;
        }

        int mid = low + (high - low) / 2;

        if(nums[mid] == target){
            return mid;
        }
        else if(target > nums[mid]){
            return recursion(nums, mid+1, high, target);
        }
        else {
            return recursion(nums, low, mid-1, target);
        }
    }
}