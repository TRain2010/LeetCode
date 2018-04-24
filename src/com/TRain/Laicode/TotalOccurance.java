package com.TRain.Laicode;

public class TotalOccurance {
	public int totalOccurance(int[] array, int target) {
		if (array == null || array.length == 0 )
		      return 0;
		    int cnt = 0;
		    int match = binarySearch(array, target);
		    if (match == -1)
		      return cnt;
		    cnt = 1;
		    int left = match - 1;
		    int right = match + 1;
		    while (left >= 0 || right <= array.length - 1) {
		     	if (left != -1 && array[left] == target) {
		        left --;
		        cnt ++;
		      } else{
		        left = -1;
		      }
		      if (right!= array.length &&array[right] == target) {
		       	right ++;
		        cnt++;
		      } else {
		        right = array.length;
		      }
		    }
		    return cnt;
		  }
		  public int binarySearch(int[]array, int target) {
		   	if (array == null || array.length == 0)
		      return -1;
		    int left = 0;
		    int right = array.length - 1;
		    while (left <= right) {
		      int mid = left + (right - left) / 2;
		      if (array[mid] == target)
		        return mid;
		      else if (array[mid] > target)
		        right = mid - 1;
		      else 
		        left = mid + 1;
		    }
		    return -1;
		
	}

}
