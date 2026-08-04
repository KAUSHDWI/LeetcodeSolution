import java.util.Arrays;

class Solution {
    public long minimalKSum(int[] nums, int k) {

        Arrays.sort(nums);

        long sum = 0;
        long current = 1;

        for (int num : nums) {

            if (num < current) {
                continue;
            }

            if (num > current) {

                long count = Math.min((long) k, num - current);

                long last = current + count - 1;

                sum += (current + last) * count / 2;

                k -= count;

                if (k == 0) {
                    return sum;
                }
            }

            current = (long) num + 1;
        }

        long last = current + k - 1;
        sum += (current + last) * k / 2;

        return sum;
    }
}