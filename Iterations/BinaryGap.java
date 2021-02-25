class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int gap = 0, prev = 0,gapTemp =0;
        while(N > 0){
            int rem = N %2;
            if(prev == 1 && rem ==0)
                gapTemp++;
            if(rem == 0 && gapTemp > gap)
                gap = gapTemp;
            N = N/2;
            if(rem == 1){
                prev = rem;
                gapTemp =0;
            }
        }
        
        return gap;
    }
}