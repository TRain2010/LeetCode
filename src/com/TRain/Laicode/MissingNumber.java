package com.TRain.Laicode;

public class MissingNumber {
	public int missingNumber(int[] array) {
		if (array == null || array.length == 0)
			return 1;
		int left = 0;
		int right = array.length - 1;
		
		// the number between this two is missing
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (mid == array[mid] - 1)
				left = mid;
			else
				right = mid;
		}
		return (array[left] + array[right]) / 2;
		
		
	}

}
