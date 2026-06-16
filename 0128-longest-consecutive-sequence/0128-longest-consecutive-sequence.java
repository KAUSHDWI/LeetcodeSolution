class Solution {
    public int longestConsecutive(int[] nums) {
        // Step 1: Create HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        
        // Step 2: Add all numbers to set
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        
        // Step 3: Check each number
        for (int num : set) {
            // ONLY START if num-1 doesn't exist
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;
                
                // Keep expanding the sequence
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                
                // Update longest if we found longer sequence
                longest = Math.max(longest, count);
            }
        }
        
        return longest;
    }
}