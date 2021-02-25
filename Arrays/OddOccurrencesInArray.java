class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int mid = A.length/2, res =0;
        for (int i = 0, j = mid+1; i < mid ; i++,j++)
				res = res ^ (A[i] ^ A[j]);
		return res ^ A[mid];
    }
}