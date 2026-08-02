/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                ans = mid;        // Possible first bad version
                high = mid - 1;   // Search on the left
            } else {
                low = mid + 1;    // Search on the right
            }
        }

        return ans;
    }
}