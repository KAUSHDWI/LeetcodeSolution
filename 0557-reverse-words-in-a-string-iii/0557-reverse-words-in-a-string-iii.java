class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);

        int breakpoint = 0;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || sb.charAt(i) == ' ') {
                int start = breakpoint;
                int end = i - 1;

                while (start < end) {
                    char temp = sb.charAt(start);
                    sb.setCharAt(start++, sb.charAt(end));
                    sb.setCharAt(end--, temp);
                }

                breakpoint = i + 1;
            }
        }

        return sb.toString();
    }
}