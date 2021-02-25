import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long sum = 0;
        if(A.length < 3){
            return 0;
        }else{
            Arrays.sort(A);
            for(int i = 0 ; i < A.length-2 ; i++){
                sum = (long)A[i] +(long)A[i+1];
                if(sum > (long)A[i+2])
                    return 1;
              }
        }
        return 0;
    }
}