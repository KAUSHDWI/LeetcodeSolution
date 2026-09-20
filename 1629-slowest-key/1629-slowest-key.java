class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {


        char max = keysPressed.charAt(0);

        int m = releaseTimes[0];

        for(int i=1 ; i<releaseTimes.length  ; i++ ){

            int curr= releaseTimes[i]-releaseTimes[i-1];

            char c = keysPressed.charAt(i);

            if( curr >m || (curr == m &&  c > max   ) ){

               m=curr;
               max = c;
                
            }
        }

        System.out.println(m);

        return max;
        
    }
}