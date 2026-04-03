class Solution {
    public boolean isPalindrome(int x) {
        
        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int n = x;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse == x;
    }
}