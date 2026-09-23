class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans =0;
        
        for(int h =0;h <= citations.length;h++){
            int count = 0;
            for(int i =0;i<citations.length;i++){
                if(citations[i] >= h){
                    count++;
                }
            }
            if(count >= h){
                ans = h;
            }
        }
        return ans;
    }
}