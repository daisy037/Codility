class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int B[]= new int[A.length];
        int i = 0;
        for( i = 0 ; i < A.length ; i++){
            if(A[i] > 0 && A[i] <= A.length)
                B[A[i]-1] = A[i];
        }
        for( i = 0 ; i < A.length ; i++){
            if(B[i] == 0)
               return i+1;
        }
        if (i == A.length)
            return i+1;
        return 1;
    }
}