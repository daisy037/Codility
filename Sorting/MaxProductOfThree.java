import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if(A[A.length-1] < 0 || (A[A.length-2]*A[A.length-3] > A[0]*A[1]))
            return A[A.length-1]*A[A.length-2]*A[A.length-3];
        else
               return A[A.length-1]*A[0]*A[1];
    }
}