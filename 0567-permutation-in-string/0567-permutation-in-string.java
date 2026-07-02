import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] s1Freq = new int[26];

        // Frequency of s1
        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
        }

        // Check every substring of length n
        for (int i = 0; i <= m - n; i++) {

            int[] windowFreq = new int[26];

            for (int j = i; j < i + n; j++) {
                windowFreq[s2.charAt(j) - 'a']++;
            }

            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }

        return false;
    }
}