package com.TRain.Laicode;
import java.util.*;

public class Combination {
	public List<List<Integer>> combination(int[] num, int target) {
	    List<List<Integer>> res = new ArrayList<>();
	    Set<List<Integer>> set = new HashSet<>();
	    List<Integer> cur = new ArrayList<>();
	    comb(num, target,0, res, cur, set);
	    return res;
	  }
	  
	  public void comb(int[] num, int target, int index, List<List<Integer>> res, List<Integer> cur, Set<List<Integer>> set) {
	   	if (target == 0) {
	   	   Collections.sort(cur);
	      if (!set.contains(cur)) {
	    	
	     	res.add(new ArrayList<>(cur));
	        
	        set.add(new ArrayList<>(cur));
	      }
	      return;
	    }
	    if (index == num.length || target < 0)
	      return;    
	    cur.add(num[index]);
	    comb(num, target - num[index], index + 1, res, cur,set);
	    cur.remove(cur.size() - 1);
	    comb(num, target, index + 1, res, cur, set);
	  }
}
