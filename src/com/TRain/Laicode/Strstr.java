package com.TRain.Laicode;

public class Strstr {
	  public int strstr(String large, String small) {
		    // write your solution here
		    if (small.length() == 0)
		      return 0;
		    if (large.length() == 0)
		      return -1;
		    for (int i = 0; i < large.length() - small.length(); i ++) {
		     	if ( large.charAt(i) != small.charAt(0))
		        continue;
		      if (check(large, small, i))
		        return i;
		    }
		    return -1;
		  }
		  private boolean check(String large, String small, int start) {
		   	for (int i = 0; i < small.length(); i ++) {
		     	if (large.charAt(start + i) != small.charAt(i))
		        return false;
		    }
		    return true;
		  }
}
