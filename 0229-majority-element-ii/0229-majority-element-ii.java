class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        } for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int val = entry.getValue();

            if(val > nums.length / 3) {
                a.add(entry.getKey());
            }
        }

        return a;
    }
}