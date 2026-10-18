class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0 || nums[i] > threshold)
                continue;

            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] > threshold)
                    break;

                if ((nums[j] % 2) == (nums[j - 1] % 2))
                    break;

                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}