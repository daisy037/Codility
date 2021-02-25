
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int charCount[][] = new int[3][S.length()+1];
		
        for(int i = 0 ; i < S.length() ; i++){
            int a = 0, b = 0, c = 0;
            if(S.charAt(i) == 'A')
                a = 1;   
            if (S.charAt(i) == 'C')
                b = 2;
            if(S.charAt(i) == 'G')
                c = 3;
					
			charCount[0][i+1] = charCount[0][i] + a;
			charCount[1][i+1] = charCount[1][i] + b;
			charCount[2][i+1] = charCount[2][i] + c;
        }
		int res_arr[] = new int[P.length];
		 for(int i = 0 ; i < P.length ; i++){
				if(charCount[0][Q[i]+1] - charCount[0][P[i]] > 0)
					res_arr[i] = 1;
				else if(charCount[1][Q[i]+1] - charCount[1][P[i]] > 0)
					res_arr[i] = 2;
				else if(charCount[2][Q[i]+1] - charCount[2][P[i]] > 0)
					res_arr[i] = 3;
				else
					res_arr[i] = 4;
		 }	
        
        return res_arr;
    }
}