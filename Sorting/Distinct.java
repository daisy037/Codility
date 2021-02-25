// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length == 0)
            return 0;
        int i = 0, result = 0, no;
        Arrays.sort(A);
        while(i < A.length){
            no = A[i];
            i++;
            while(i < A.length){
                if(no == A[i])
                    i++;
                else
                    break;
            }
            result++;
        }
        return result;
    }
}


/* 	Set set = new HashSet();
	for(int i : A )
		set.add(i);
    return set.size();
*/