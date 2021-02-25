class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int res = 0;
        if( A == 0)
            res++;
        if(K > A)
            return res+B/K;
        else
            return res+B/K - (A-1)/K;
    }
}