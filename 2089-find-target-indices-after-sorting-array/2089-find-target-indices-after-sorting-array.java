class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> arrayList = new ArrayList<>();

        int count_less =0;
        int same_numbers = 0;

        for(int num :nums) {
            if(num<target) count_less++;
            else if(num== target) same_numbers++;

        }

        while(same_numbers!=0) {
            arrayList.add(count_less++);
            same_numbers--;
        }
        return arrayList;
    }
}