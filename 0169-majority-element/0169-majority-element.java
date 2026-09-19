class Solution {
    public int majorityElement(int[] nums) {
        //BF
        // Arrays.sort(nums);
        // return nums[nums.length/2];



// Hashmap
HashMap<Integer,Integer>map = new HashMap<>();
for(int num : nums){
    map.put(num,map.getOrDefault(num,0) +1);
    if(map.get(num)> nums.length/2){
        return num;
    }
}
return -1;
        //Boyer- Moore Voting Algorithm 


    }
}