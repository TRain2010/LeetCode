package com.TRain.Laicode;

import java.util.*;

public class ValidPare {

	public List<String> validParantheses(int n) {
		List<String> res = new ArrayList<>();
		if (n == 0)
			return res;
		StringBuilder sb = new StringBuilder();
		allValidPar(n, n, sb, res);
		return res;
	}
	
	public void allValidPar(int left, int right, StringBuilder sb, List<String> res) {
		if (left == 0 && right == 0) {
			res.add(sb.toString());
			return ;
		}
		if (left > right || left < 0 || right < 0)
			return;
		else {
			allValidPar(left - 1, right, sb.append('('), res);
			sb.deleteCharAt(sb.length() - 1);
			allValidPar(left, right - 1, sb.append(')'), res);
			sb.deleteCharAt(sb.length() - 1);
		}
		
	}
}
