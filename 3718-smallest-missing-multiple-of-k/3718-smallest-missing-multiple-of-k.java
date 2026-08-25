class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }
        int mlp = k;
        while(true){
            if(!map.containsKey(mlp)){
                return mlp;
            }
                mlp += k;
            
        }
    }
}