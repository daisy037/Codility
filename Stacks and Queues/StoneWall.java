// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//[2, 5, 1, 4, 6, 7, 9, 10, 1]
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        if(H.length == 1)
            return 1;
        int result = 0;
        Queue queue = new LinkedList<Integer>();
        for(int k = 0 ; k < H.length ; k++)
            queue.add(H[k]);
		queue.add(0);
        while(!queue.isEmpty()){
            int height = (int)queue.poll();
            while( !queue.isEmpty()){
                int curr_height = (int)queue.poll();
                if(curr_height == 0)
                {
                    result++;
                    while(!queue.isEmpty()){
                        if((int)queue.peek() == 0)
                            queue.poll();
                        else{
                            curr_height =(int)queue.poll();
                            height = curr_height;
                            break;
                        } 
                    }
                    if(queue.isEmpty())
                    break;
                }
                if(curr_height < height){
                    result++;
                    height = curr_height;
                }
                queue.add(curr_height - height);
            }
        }
        return result;
    }
}
