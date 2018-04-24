package com.TRain.Laicode;

public class LastLen {
	  public int lenOflast(String s) {
		    // Write your solution here
		    if (s == null || s.length() == 0)
		      return 0;
		    char[] array = s.toCharArray();
		    reverse(array);
		    int cnt = 0;
		    int i = 0;
		    while (array[i] == ' ')
		       i++;
		    if (i == array.length)
		      return 0;
		    else {
		      while (array[i] != ' ') {
		       	i++;
		        cnt ++;
		      }
		      return cnt;
		    }
		  }
		  
		  public void reverse(char[] array) {
		    if (array == null || array.length == 0)
		      return; 
		    for (int i = 0; i < array.length; i ++) {
		     	char tmp = array[i];
		      array[i] = array[array.length - 1 - i];
		      array[array.length - 1 - i] = tmp;
		    }
		  }
}
