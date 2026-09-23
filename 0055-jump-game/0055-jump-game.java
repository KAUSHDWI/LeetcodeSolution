// class Solution {
//     public boolean canJump(int[] nums) {
//         return solve(nums,0);
//     }
//     private boolean solve (int [] nums, int index){
//         int n = nums.length;
//         if(index == n-1 ){
//             return true;
//         }
//         for(int j =1;j<=nums[index];j++){
//             int i = index+j;
//             if(i <n){
//                 if(solve(nums,i)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean canJump(int[] nums) {
       int reachable = 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           reachable = Math.max(reachable, i + nums[i]);
       } 
       return true;
    }
}