// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Stack;
class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int result = A.length, P = 0, Q =0;
        int i = 0;
        Stack<Integer> stack = new Stack<Integer>(); 
        while(i < A.length){
            if(B[i] == 1)
                break;
            i++;
        }
        while(i < A.length){
            if(B[i] == 1)
                stack.push(A[i]);
            else{
                if(!stack.empty())
                {    
                    P = stack.peek();
                    Q = A[i];
                    result--;
                    if(P < Q){
                        stack.pop();
                        continue;
                    }
                }
            }
            i++;
        }
        
        return result;
    }
}
