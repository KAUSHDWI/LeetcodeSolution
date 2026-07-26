class Solution {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        char[] res = new char[s.length()];
        char curr = chars[0];
        int count = 1, itr = 0;

        res[itr++] = curr;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == curr) {
                count++;
                if (count < 3) {
                    res[itr++] = chars[i];
                }
            } else {
                curr = chars[i];
                count = 1;
                res[itr++] = chars[i];
            }
        }

        return new String(res, 0, itr);
    }
}