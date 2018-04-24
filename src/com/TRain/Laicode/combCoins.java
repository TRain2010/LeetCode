package com.TRain.Laicode;
import java.util.*;
public class combCoins {
	public List<List<Integer>> combinations(int target, int[] coins) {
		List<List<Integer>> res = new ArrayList<>();
		if (target == 0)
			return res;
		List<Integer> current = new ArrayList<>();
		combination(target, coins, 0, current, res);
		return res;
		
	}
	
	private void combination(int target, int[] coins, int layer, List<Integer> current, List<List<Integer>> res) {

		// no possible way
		if (layer == coins.length) {
			if (target != 0)
				return;
			else {
				res.add(new ArrayList<>(current));
				return;
			}
				
		}
		// coins[layer] can be 0 to max;
		int max = target / coins[layer];
		for (int i = 0; i <= max; i ++) {
			current.add(i);
			combination(target - coins[layer] * i, coins,layer + 1, current, res);
			current.remove(current.size() - 1);
		}
		
		
		return;
	}

}
