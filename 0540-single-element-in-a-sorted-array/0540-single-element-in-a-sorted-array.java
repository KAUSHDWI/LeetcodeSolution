class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int ele : nums )
        {
            sum^=ele;
        }
        return sum;

    }
}