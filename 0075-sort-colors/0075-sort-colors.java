class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0, count1 = 0, count2 = 0;

        // Count frequency
        for (int num : nums) {
            if (num == 0)
                count0++;
            else if (num == 1)
                count1++;
            else
                count2++;
        }

        // Fill 0s
        int index = 0;
        while (count0-- > 0) {
            nums[index++] = 0;
        }

        // Fill 1s
        while (count1-- > 0) {
            nums[index++] = 1;
        }

        // Fill 2s
        while (count2-- > 0) {
            nums[index++] = 2;
        }
    }
}