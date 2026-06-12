class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (int num : nums) {
        if (seen.contains(num)) {
            return true;   // pehle mil chuka
        }
        seen.add(num);
    }
    return false;
}
// Time O(n), Space O(n) {
        
    }
