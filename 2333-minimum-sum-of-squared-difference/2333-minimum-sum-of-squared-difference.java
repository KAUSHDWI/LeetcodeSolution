import java.util.Arrays;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int maxDiff = 0;
        
        // Find the absolute differences and track the maximum difference
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[i] = Math.abs(nums1[i] - nums2[i]);
            if (diffs[i] > maxDiff) {
                maxDiff = diffs[i];
            }
        }
        
        // If maxDiff is 0, no changes are needed
        if (maxDiff == 0) return 0;
        
        // Create a frequency bucket array up to the maximum observed difference
        int[] buckets = new int[maxDiff + 1];
        for (int d : diffs) {
            buckets[d]++;
        }
        
        long totalK = (long) k1 + k2;
        
        // Greedily reduce the largest differences starting from the top down
        for (int d = maxDiff; d > 0; d--) {
            if (buckets[d] > 0) {
                // If our budget can completely bring down all items at this level to the next level
                long operationsNeeded = (long) buckets[d];
                if (totalK >= operationsNeeded) {
                    buckets[d - 1] += buckets[d];
                    totalK -= operationsNeeded;
                    buckets[d] = 0;
                } else {
                    // Reduce as many as we can given the remaining totalK budget
                    int countToReduce = (int) totalK;
                    buckets[d - 1] += countToReduce;
                    buckets[d] -= countToReduce;
                    totalK = 0;
                    break; // Budget is exhausted
                }
            }
        }
        
        // Calculate the final sum of squared differences
        long minSquaredSum = 0;
        for (int d = 1; d <= maxDiff; d++) {
            if (buckets[d] > 0) {
                minSquaredSum += (long) buckets[d] * d * d;
            }
        }
        
        return minSquaredSum;
    }
}