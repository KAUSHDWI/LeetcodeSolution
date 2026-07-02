import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] wFreq = new int[26];

        // Frequency of s1
        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            wFreq[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Freq, wFreq)) {
            return true;
        }

        for (int i = n; i < m; i++) {

            wFreq[s2.charAt(i) - 'a']++;

            wFreq[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(s1Freq, wFreq)) {
                return true;
            }
        }

        return false;
    }
}