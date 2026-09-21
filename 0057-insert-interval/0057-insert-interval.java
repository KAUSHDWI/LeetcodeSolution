class Solution {
    
    public int[][] insert(int[][] intervals, int[] newI) {
        int n = intervals.length;
        ArrayList<ArrayList<Integer>> k = new ArrayList<>();

        for (int[] i : intervals) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(i[0]);
            l.add(i[1]);
            k.add(l);
        }
        boolean added = true;;
        for (int i = 0; i < n; i++) {
            int m = k.get(i).get(1);
            if (newI[0] <= m) {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(newI[0]);
                l.add(newI[1]);
                k.add(i,l);
                added = false;
                break;
            }
        }

        if (added) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(newI[0]);
            l.add(newI[1]);
            k.add(l);            
        }
        int l = 0;
        while (l < k.size() - 1) {

            if (k.get(l).get(1) >= k.get(l + 1).get(0)) {
                k.get(l).set(0, Math.min(k.get(l).get(0), k.get(l + 1).get(0)));
                k.get(l).set(1, Math.max(k.get(l).get(1), k.get(l + 1).get(1)));
                k.remove(l + 1);
            }
            else 
                l += 1;
        }

        int[][] ans = new int[k.size()][2];

        for (int i = 0; i < k.size(); i++) {
            ans[i][0] = k.get(i).get(0);
            ans[i][1] = k.get(i).get(1);
        }
        return ans;
    }
}