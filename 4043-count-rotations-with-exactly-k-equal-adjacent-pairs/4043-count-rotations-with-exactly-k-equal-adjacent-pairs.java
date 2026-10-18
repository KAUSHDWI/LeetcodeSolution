
class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int res = 0;

        for (int start = 0; start < n; start++) {
            int score = 0;

            for (int i = 0; i < n - 1; i++) {
                char curr = s.charAt((start + i) % n);
                char next = s.charAt((start + i + 1) % n);

                if (curr == next) {
                    score++;
                }
            }

            if (score == k) {
                res++;
            }
        }

        return res;
    }
}