class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        for (int count : freq) {
            if (isPrime(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}