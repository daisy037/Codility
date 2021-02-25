class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long N = A.length+1;
        long sum = (N*(N+1))/2;
        for(int i = 0 ; i < A.length ; i++){
            sum -= A[i];
        }
        
        return (int)(sum);
    }
}