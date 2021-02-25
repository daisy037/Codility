import java.util.HashSet;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> h= new HashSet<Integer>() ;
        for(int i = 0; i < A.length ;i++){
			if(A[i ] > A.length)
				return 0;
			h.add(A[i]);
        }
		if(h.size() !=  A.length )
            return 0;
            
        else
            return 1;
    }
}