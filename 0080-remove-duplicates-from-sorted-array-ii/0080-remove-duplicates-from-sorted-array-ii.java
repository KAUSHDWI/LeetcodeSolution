class Solution {
    public int removeDuplicates(int[] nums) {
        // int k =0;
        // int count =0;
        // for(int i =0;i<nums.length;i++){
        //     if(i==0 || nums[i] != nums[i-1]){
        //         count = 1;
        //     }else{
        //         count++;
        //     }
        //     if(count <= 2){
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k;
        
        // two pinter 
        int k =2;
        for(int i =2;i<nums.length;i++){
            if(nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}