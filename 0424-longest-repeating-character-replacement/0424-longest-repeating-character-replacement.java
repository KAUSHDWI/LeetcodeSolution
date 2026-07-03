class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;     // Maximum frequency of any character in current window
        int maxLength = 0;   // Answer

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowSize = right - left + 1;

            while (windowSize - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;

                windowSize = right - left + 1;
            }

            maxLength = Math.max(maxLength, windowSize);
        }

        return maxLength;
    }
}