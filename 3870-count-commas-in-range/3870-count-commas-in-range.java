
class Solution {
    public int countCommas(int n) {
        // if (n < 1000) {
        //     return 0;
        // }

        // return n - 999;



          return Math.max(0, n - 999);
    }
}

