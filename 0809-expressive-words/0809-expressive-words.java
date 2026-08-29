class Solution {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words) {
            if (isStretchy(word, s)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean isStretchy(String word, String s) {
        int i = 0, j = 0; 
        
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) != s.charAt(j)) {
                return false; 
            }
            
            int wordCount = 0, sCount = 0;
            char currentChar = word.charAt(i);
            while (i < word.length() && word.charAt(i) == currentChar) {
                i++;
                wordCount++;
            }
            while (j < s.length() && s.charAt(j) == currentChar) {
                j++;
                sCount++;
            }
            
            if (wordCount > sCount || (sCount < 3 && sCount != wordCount)) {
                return false;
            }
        }
        
        return i == word.length() && j == s.length();
    }
}