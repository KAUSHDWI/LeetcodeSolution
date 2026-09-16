class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i =0;i<n;i++){
        //     nums1[m+i] = nums2[i];
        // }
        // Arrays.sort(nums1);


        // TWO Pointer : 
       // Two Pointers
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge from the end
        while (i >= 0 && j >= 0) {

            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } 
            else {
                nums1[k] = nums1[i];
                i--;
            }

            k--;
        }

        // If nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}