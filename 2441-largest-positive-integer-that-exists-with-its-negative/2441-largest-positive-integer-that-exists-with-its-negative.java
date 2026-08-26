class Solution {
    public int findMaxK(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for (int num : arr) {
            if (map.containsKey(num * -1)) {
                max = Math.max(max, Math.abs(num));
            }
            map.put(num, 0);
        }
        return max;
    }
}