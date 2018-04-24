package com.TRain.Laicode;

public class KSmallSum {

	public int kthSum(int[] A, int[] B, int k) {
		int cnt = 0;
		int boardA = 0;
		int boardB = 0;
		int result = 0;
		while (cnt < k ) {
			result = A[boardA] + B[boardB];
			cnt ++;
			if (boardA == A.length- 1)
				boardB ++;
			else if (boardB == B.length - 1)
				boardA ++;
			else {
				if (A[boardA] <= B[boardB])
					boardB++;
				else
					boardA++;
			}
			
		}
		return result;
		
	}
}
