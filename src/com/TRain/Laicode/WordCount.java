package com.TRain.Laicode;

public class WordCount {
	public int numOfWords(String input) {
		if (input == null || input.length() == 0)
			return 0;
		int cnt = 0;
	    for (int i = 0; i < input.length(); i ++) {
	     	while (i < input.length() && (input.charAt(i) == ' ' || input.charAt(i) == '\n' || input.charAt(i) == '\t')) {
	        i++;
	      }
	      if (i < input.length())
	        cnt ++;
	    }
	    return cnt;
	}

}
