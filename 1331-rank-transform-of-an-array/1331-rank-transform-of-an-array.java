class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        int[] ans = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : arr)
        {
            set.add(val);
        }
        int rank = 1;
        for(int val : set)
        {
            map.put(val,rank++);
        }
        int index = 0;
        for(int val : arr)
        {
            ans[index++] = map.get(val);
        }
        return ans;
    }
}