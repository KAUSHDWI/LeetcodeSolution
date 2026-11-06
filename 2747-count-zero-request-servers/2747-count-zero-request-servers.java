class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = queries.length, len = logs.length;
        int[] res = new int[m];
        //maybe sort queries? we'll get the times sorted
        //so we will have a increasing boundry l,r (l = qi-x, r = qi)
        //sort logs based on time, maintain a map with mp[serverid] = cnt of logs within [l,r]
        //move l,r, update map, remove from map if cnt = 0

        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        Integer[] qid = new Integer[m];
        for(int i=0; i<m; ++i)qid[i] = i;
        Arrays.sort(qid, (a, b) -> Integer.compare(queries[a], queries[b]));
        int[] mp = new int[n+2];

        int l = 0, r = 0, cnt = 0;

        //now iterate the queries (in sorted order of time)
        for(int i : qid){
            int q = queries[i];
            //now the boundry is [q-x, q]
            while(r< len && logs[r][1] <= q){
                //this log is in the boundry, so update the map
                mp[logs[r][0]] +=1;
                //if this server is counted for 1st time, then inc cnt
                if(mp[logs[r][0]] == 1)++cnt;
                ++r;
            }
            while(l<r && logs[l][1] < q-x){
                mp[logs[l][0]] -= 1;
                if(mp[logs[l][0]] == 0)--cnt;
                ++l;
            }
            //cnt is active, so inactive is
            res[i] = n-cnt;
        }

        return res;
    }
}