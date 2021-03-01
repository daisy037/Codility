// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collection;
class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int steps = X;
        boolean[] covered = new boolean[steps+1];
        for(int i = 0; i < A.length; i++){
            if(!covered[A[i]]){
                covered[A[i]] = true;
                steps--;
                if(steps == 0) 
                    return i;
            }
        }
		return -1;
    }
}
