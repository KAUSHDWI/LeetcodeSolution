class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int median = findKth(nums, (n + 1) / 2);

        int left = 0, i = 0, right = n - 1;

        while (i <= right) {
            if (nums[index(i, n)] > median) {
                swap(nums, index(left++, n), index(i++, n));
            } else if (nums[index(i, n)] < median) {
                swap(nums, index(i, n), index(right--, n));
            } else {
                i++;
            }
        }
    }

    private int index(int i, int n) {
        return (1 + 2 * i) % (n | 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int findKth(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        k = nums.length - k;

        while (left <= right) {
            int pivot = partition(nums, left, right);
            if (pivot == k)
                return nums[pivot];
            else if (pivot < k)
                left = pivot + 1;
            else
                right = pivot - 1;
        }
        return -1;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int p = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, p++);
            }
        }

        swap(nums, p, right);
        return p;
    }
}