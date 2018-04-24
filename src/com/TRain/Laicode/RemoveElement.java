package com.TRain.Laicode;
import java.util.*;
public class RemoveElement {
	  public int[] removeElement(int[] input, int value) {
		    // Write your solution here
		    if (input == null || input.length == 0)
		      return input;
		    int left = 0;
		    int right = input.length - 1;
		    while (right > left ) {
		     	if (input[left] == value) {
		       	shift(input, left, right);
		        right --;
		      } else {
		        left ++;
		      }
		    }
		    return Arrays.copyOfRange(input, 0, right + 1);
		    
		  }
		  
		  public void shift(int[] array, int left, int right) {
		    int tmp = array[left];
		    for (int i = left; i < right -1; i ++) {
		      array[i] = array[i + 1];
		    }
		    array[right] = tmp;
		  }
}
