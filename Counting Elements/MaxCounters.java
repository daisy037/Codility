
class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int res[] = new int[N];
        int max = 0,flag = 0;
        for(int i = 0 ; i < A.length; i++){
            if(A[i] <=N){
                flag = 0;
                if(++res[A[i]-1]> max)
                    max = res[A[i]-1];
            }else if(flag==0){
                flag = 1;
                for(int j = 0; j < N ; j++)
                    res[j] = max;
            }
        }
        return res;
    }
}