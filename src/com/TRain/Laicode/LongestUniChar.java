package com.TRain.Laicode;
import java.util.*;
// pwwkew

public class LongestUniChar {
	public int longstSubString(String s) {
		char[] array = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		int start = 0;
		int end = 0;
		int max = 0;
		while (end < array.length ) {
			
			if (set.contains(array[end])) {
				while (set.contains(array[end])) {
					set.remove(array[start]);
					start ++;
				}
				
				//end ++;
				
			}
			else {
				set.add(array[end]);
				if (end - start + 1 >= max) 
					max = end - start + 1;
				
				end ++;
			}
		}	
			
		
		return max;
	}

}
