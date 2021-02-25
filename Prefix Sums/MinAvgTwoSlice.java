// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int i = 0, index = 0;
        double curr_avg1=0, curr_avg2=0,minAvg =Double.MAX_VALUE;
        for(; i < A.length-2; i++){
            curr_avg1 = (A[i] + A[i+1])/2.0;
            curr_avg2 = (A[i] + A[i+1] + A[i+2])/3.0;
            if(curr_avg1 < curr_avg2){
				if(curr_avg1 < minAvg){
                    minAvg = curr_avg1;
                    index = i;
                }
            }else{
                if(curr_avg2 < minAvg){
                    minAvg = curr_avg2;
                    index = i;
                }               
            }
        }
        curr_avg2 = (A[A.length-2] + A[A.length-1])/2.0;
        if(curr_avg2 < minAvg){
            minAvg = curr_avg2;
            index = A.length-2;
        }
        return index;
    }
}