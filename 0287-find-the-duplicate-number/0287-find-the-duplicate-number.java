// import java.util.Arrays;

// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);  //  sort the array
        
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {  // check neighbors
//                 return nums[i];
//             }
//         }
        
//         return -1; 
//     }
// }
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        int slow2 = nums[0];

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;        
    }
}