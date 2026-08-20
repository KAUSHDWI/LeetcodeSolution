
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> feq = new HashMap<>();
        for (int num : nums) {
            feq.put(num, feq.getOrDefault(num, 0) + 1);
        }
        
        for (int a : feq.values()) {
            if (a % 2 != 0) {
                return false;
            }
        
        }
        
        return true;
    }
}

