class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        int j = nums.length -1 ;
        int [] result = new int[nums.length];
        //loop for squaring
        for(int k=0;k<nums.length;k++){
            nums[k] = nums[k] * nums[k];
        }
        //loop for two pointer 
        for(int pos=nums.length-1;pos>=0;pos--){
            if(nums[i]>nums[j]){
                result[pos] = nums[i];
                i++;

            }
            else{
                result[pos] = nums[j];

                j--;
            }
        }
        return result;

    }
    
    
}