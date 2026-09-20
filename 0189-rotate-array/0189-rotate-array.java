class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;

        // for (int r = 0; r < k; r++) {

        //     int last = nums[n - 1];

        //     for (int i = n - 1; i > 0; i--) {
        //         nums[i] = nums[i - 1];
        //     }
        //     nums[0] = last;
        // }



        // two pointer 
       int n = nums.length;

        // In case k is greater than n
        k = k % n;

        // 1. Reverse the whole array
        reverse(nums, 0, n - 1);

        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);

        // 3. Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}