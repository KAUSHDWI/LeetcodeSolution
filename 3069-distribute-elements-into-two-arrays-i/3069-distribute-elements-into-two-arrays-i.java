class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        // Step 1 = Create a two array 
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        // step 2 =  First two elements put from nums[]
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        // step 3 = taking last elemnt in both the array and compare each other 
        for (int i = 2; i < n; i++) {
            int last1 = arr1.get(arr1.size() - 1);
            int last2 = arr2.get(arr2.size() - 1);
            // step 4 = compare last elment each other and add thum accoding to process
            if (last1 > last2) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] result = new int[n];
        int ix = 0;

        for (int x : arr1) {
            result[ix++] = x;
        }

        for (int x : arr2) {
            result[ix++] = x;
        }

        return result;
    }
}