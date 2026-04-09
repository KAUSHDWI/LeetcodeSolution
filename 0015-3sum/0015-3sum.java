class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array (important for two-pointer technique)
        Arrays.sort(nums);
        
        // Step 2: Iterate through array, fixing one element at a time
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 3: Two pointers approach
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];  // We need nums[left] + nums[right] = target
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers
                    left++;
                    right--;
                } 
                else if (sum < target) {
                    // Sum is too small, move left pointer to increase sum
                    left++;
                } 
                else {
                    // Sum is too large, move right pointer to decrease sum
                    right--;
                }
            }
        }
        
        return result;
    }
}