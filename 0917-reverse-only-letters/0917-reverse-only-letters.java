class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            // skip non-letters from left
            if (!Character.isLetter(arr[i])) {
                i++;
            }
            // skip non-letters from right
            else if (!Character.isLetter(arr[j])) {
                j--;
            }
            // both are letters → swap
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}