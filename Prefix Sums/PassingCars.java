class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int curr_counter = 0 , counter  = 0;
        for(int i = A.length-1 ; i >= 0 ; i--){
            if(A[i]== 1){
                curr_counter++;
            }else{
                if(counter > 1000000000)
                    return -1;
                counter += curr_counter;
            }
        }
        return counter;
    }
}