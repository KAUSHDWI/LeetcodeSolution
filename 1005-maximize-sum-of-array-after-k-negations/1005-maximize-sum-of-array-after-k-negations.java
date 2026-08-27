class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        int[] freq = new int[201];

        for (int num : nums) {
            freq[num + 100]++;
        }
        for (int num = -100; num < 0 && k > 0; num++) {

            while (freq[num + 100] > 0 && k > 0) {

                freq[num + 100]--;

                freq[-num + 100]++;

                k--;
            }
        }
        int minAbs = 100;

        for (int num = 0; num <= 100; num++) {
            if (freq[num + 100] > 0) {
                minAbs = num;
                break;
            }
        }

        if (k % 2 == 1) {
            freq[minAbs + 100]--;
            freq[-minAbs + 100]++;
        }

        int sum = 0;

        for (int num = -100; num <= 100; num++) {
            sum += num * freq[num + 100];
        }

        return sum;
    }
}