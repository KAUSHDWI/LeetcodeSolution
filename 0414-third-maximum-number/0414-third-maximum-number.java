class Solution {
    public int thirdMax(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        int n = list.size();

        if (n < 3) {
            return list.get(n - 1);
        }

        return list.get(n - 3);
    }
}