class Solution {
    public int divisorSubstrings(int num, int k) {

        int count = 0;
        int numCopy = num;
        int windowSize = (int) Math.pow(10, k);

        while (numCopy >= windowSize / 10) {

            int divisor = numCopy % windowSize;

            if (divisor != 0 && num % divisor == 0) {
                count++;
            }

            numCopy /= 10;
        }

        return count;
    }
}