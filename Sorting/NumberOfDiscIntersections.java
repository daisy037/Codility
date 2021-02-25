class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        for(int i = 1 ; i < A.length ; i++){
			if(A[i]>= i){
				count += i;
			}else{
				for(int j = i-1 ,k = 0; k < i; j--, k++){
					if(A[i]+A[k] >= i-k){
						count +=1;
				    }
				    if(A[i] >= j){
						count += j;
						break;
					
					}
				}
			}
			if(count > 10000000)
						return -1;
        }
        return count;
    }
}