
class Solution {
    public boolean divideArray(int[] nums) {
        // step 1 = Make an Hashmap and count the feq of elemnt 

        HashMap<Integer, Integer> feq = new HashMap<>();
        for (int num : nums) {
            feq.put(num, feq.getOrDefault(num, 0) + 1);
        }

       // step 2 = if frq of elemnt is not divided by 2 so it will return false
        for (int a : feq.values()) {
            if (a % 2 != 0) {
                return false;
            }
        
        }
        
        return true;
    }
}

