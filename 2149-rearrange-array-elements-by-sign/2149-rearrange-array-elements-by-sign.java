class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int [nums.length];
        int pos =0;
        int neg = 1;
        for(int num : nums){
            if (num>0){
                arr[pos] = num;
                pos = pos + 2;

            }
            else{
                arr[neg] = num;
                neg = neg +2;
            }
            
        } 
        return arr;
    }
}