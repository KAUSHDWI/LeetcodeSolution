class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(max, i);
        }

        int low = 1;
        int high = max;

        while(low < high){
            int mid = low + (high - low) / 2;
            int val = Value(nums, mid);

            if(val > threshold){
                low = mid + 1;
            }else{
                high = mid;
            }

        }
        return low;
        
    }

    private int Value (int [] arr, int div){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += (arr[i] + div - 1) / div;
        }
        return sum;
    }
}