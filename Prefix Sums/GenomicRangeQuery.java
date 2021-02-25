class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int res_arr[] = new int[P.length];
        for(int i = 0 ; i < P.length ; i++){
            int res = 4;
            for(int j = P[i]; j <= Q[i] ; j++){
                if(S.charAt(j) == 'A'){
                    res = 1;   
                    break;
                }
				if(res == 2)
						continue;
                if (S.charAt(j) == 'C'){
                    res = 2;
                }
                if(S.charAt(j) == 'G')
                    res = 3;
            }
            res_arr[i] = res;
        }
        
        return res_arr;
    }
}