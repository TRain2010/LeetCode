package com.TRain.Laicode;

import java.util.Arrays;

public class MinJump {
	public int minJump(int[] array, int index) {
	    if (array == null || array.length <= 1 || array[index] == 0)
	        return 0;
	      
	      int[] jump = new int[array.length];
	      Arrays.fill(jump, -1);
	      int end = array.length - 1;
	      jump[end] = 0;
	      for (int i = end  - 1; i >= 0; i --) {     	
	        if ( array[i] >= end - i) {
	          jump[i] = 1;
	          continue;
	        } else {
	         	int min = Integer.MAX_VALUE;
	          for (int j = i + array[i]; j >0; j --) {
	           	if (jump[j] != -1) {
	              jump[i] = jump[j] + 1;
	              min = Math.min(min, jump[i]);
	              jump[i] = min;
	            }          
	          }
	        }      
	      }
	      // jump[i] is min jump to jump rightward to the end, we need to check jump to left then to right;
	      
	      for (int i =0; i < array.length; i ++) {
	    	  if (array[i] >= end - i)
	    		  jump[i] = 1;
	    	  else {
	    		  for (int j = i - 1; j >= Math.max(0, i - array[i]); j--) {
	    			  if (jump[j] != -1) {
	    				  jump[i] = (jump[i] == -1) ? (jump[j] + 1) : Math.min(jump[i], jump[j] + 1);
	    			  }
	    		  }
	    	  }
	      }
//	      for (int i = index - 1; i >= Math.max(0, index - array[index]); i --) {      
//	       	if (jump[i] != -1) {
//	         	jump[index] = (jump[index] == -1) ? (jump[i] + 1):Math.min(jump[index], jump[i]+1);
//	        }
//	      }
	      return jump[index];
		
	}

}
