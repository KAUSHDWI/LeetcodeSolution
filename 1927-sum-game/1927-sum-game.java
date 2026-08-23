class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int d = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean fh = i < n / 2;

            if (num.charAt(i) == '?') {
                count += fh ? 1 : -1;
            } else {
                int digit = num.charAt(i) - '0';
                d += fh ? digit : -digit;
            }
        }

        return 2 * d != -9 * count;
    }
}