package com.TRain.Laicode;

public class ShiftPosition {
	public int shiftPos(int[] array) {
		
		if (array == null || array.length == 0)
			return -1;
		if (array.length == 1)
			return 0;
		int left = 0;
		int right = array.length - 1;
		while (left  < right - 1) {
			int mid = left + (right - left) / 2;
			if ((array[mid] < array[mid - 1]) && array[mid] < array[mid+1])
				return mid;
			else {
				if (array[mid] > array[right])
					left = mid;
				else 
					right = mid;
			}
		}
		if (array[left] > array[right])
			return right;
		return left;
	}

}
