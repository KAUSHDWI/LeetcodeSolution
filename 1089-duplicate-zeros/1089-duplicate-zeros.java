class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        
        int i = 0; // pointer for original array
        int j = 0; // pointer for temp array
        
        while (i < n && j < n) {
            if (arr[i] == 0) {
                temp[j++] = 0;
                if (j < n) {
                    temp[j++] = 0; // duplicate zero
                }
            } else {
                temp[j++] = arr[i];
            }
            i++;
        }
        
        // copy back to original array
        for (int k = 0; k < n; k++) {
            arr[k] = temp[k];
        }
    }
}