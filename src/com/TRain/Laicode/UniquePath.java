package com.TRain.Laicode;
import java.util.*;
public class UniquePath {
	public int uniquePath(int m, int n) {
		List<int[]> cur = new ArrayList<>();
		List<List<int[]>> res = new ArrayList<>();
		findPath(0,0,m,n,cur,res);
		for (int i = 0; i < res.size(); i ++)
			System.out.println(res.get(i));
		return res.size();
	}
	
	private void findPath(int row, int col, int m, int n, List<int[]> cur, List<List<int[]>> res) {
		if (row == m - 1 && col == n - 1) {
			cur.add(new int[] {m-1,n-1});
			res.add(new ArrayList<>(cur));
			return;
		}
		cur.add(new int[] {row, col});
		if (row + 1 < m && col + 1 < n ) {
			// can go to both direction
			findPath(row + 1, col, m, n, cur,res);
			cur.remove(cur.size() - 1);
			findPath(row, col + 1, m, n, cur,res);
			cur.remove(cur.size() - 1);
		} else if (row + 1 < m) {
			// only go bot
			findPath(row + 1, col, m, n, cur, res);
			cur.remove(cur.size() - 1);
		} else {
			findPath(row, col + 1, m, n, cur, res);
			cur.remove(cur.size() - 1);
		}
		
	}

}
