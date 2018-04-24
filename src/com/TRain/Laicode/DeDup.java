package com.TRain.Laicode;
import java.util.*;
public class DeDup {
	public String deDup(String input) {
	    if (input == null || input.length() <= 1)
	        return input;
	      StringBuilder sb = new StringBuilder();
	      sb.append(input.charAt(0));
	      for (int i = 1; i  < input.length(); i ++) {
	       	if (input.charAt(i) == sb.charAt(sb.length() - 1))
	          sb.deleteCharAt(sb.length() - 1);
	        while ( i < input.length() && input.charAt(i)== input.charAt(i - 1)) 
	          i ++;
	        if (i < input.length()) {
	         	 if (sb.length() == 0||input.charAt(i) != sb.charAt(sb.length() - 1))
	             sb.append(input.charAt(i));
	          else 
	            sb.deleteCharAt(sb.length() -1);
	        }
	        
	      }
	      return sb.toString();
	}

}
