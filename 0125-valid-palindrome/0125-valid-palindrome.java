
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        // Create clean string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        // Reverse the clean string
        String reverse = str.reverse().toString();

        // Compare
        return str.toString().equals(reverse);
    }
}

