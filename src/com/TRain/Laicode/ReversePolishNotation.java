package com.TRain.Laicode;
import java.util.*;

public class ReversePolishNotation {
	public int evalRPN(String[] tokens) {
		if (tokens == null || tokens.length == 0 )
			return -1;
		Deque<Integer> stack = new LinkedList<>();
		for (int i = 0; i < tokens.length; i ++) {
			if (!isOperator(tokens[i]))
			stack.offerFirst(Integer.parseInt(tokens[i]));
			else {
				int a = stack.pollFirst();
				int b = stack.pollFirst();
				switch(tokens[i]) {
				case "+":
					stack.offerFirst(b + a);
					break;
				case "-":
					stack.offerFirst(b - a);
					break;
				case "/":
					stack.offerFirst(b / a);
					break;
				case "*":
					stack.offerFirst(b * a);
					break;
				default:
					break;
					
				}
				
			}
		}
		
		return stack.peek();
	}
	
	public boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-")||s.equals("/")||s.equals("*"))
			return true;
		else
			return false;
	}

}
