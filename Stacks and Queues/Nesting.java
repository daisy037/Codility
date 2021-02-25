// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Stack;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack stack = new Stack<Character>();
        int i = 0;
        while(i < S.length()){
            char ch = S.charAt(i);
            if( ch == '(')
                stack.push(ch);
            else{
                if(!stack.empty()){
                    char ch2 = (char)stack.peek();
                    if( ch == ')' && ch2 == '(')
                        stack.pop();
                    else
                        return 0;
                }else{
                     return 0;
                }
            }
            i++;
        }
        
        if(stack.empty())
            return 1;
        else
            return 0;

    }
}
