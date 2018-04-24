package com.TRain.Laicode;
import java.util.*;
public class KthSmallInMatrix {
	static class Cell{
		int aIndex;
		int bIndex;
		int sum;
		Cell(int aIndex, int bIndex, int sum) {
			this.aIndex = aIndex;
			this.bIndex = bIndex;
			this.sum = sum;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == this)
				return true;
			if (!(obj instanceof Cell))
				return false;
			Cell other = (Cell) obj;
			return this.aIndex == other.aIndex && this.bIndex == other.bIndex;
		}
		@Override
		public int hashCode() {
			return aIndex & 31 + bIndex;
		}
	}
	public int kthSum(int[] A, int[] B, int k) {
		int aLen = A.length;
		int bLen = B.length;
		PriorityQueue<Cell> pq = new PriorityQueue<Cell>(k, new Comparator<Cell>() {
			@Override
			public int compare(Cell o1, Cell o2) {
				return o1.sum - o2.sum;
			}
		});
		Set<Cell> set = new HashSet<>();
		set.add(new Cell(0,0,A[0] + B[0]));
		pq.offer(new Cell(0,0,A[0] + B[0]));
		for (int i = 1; i < k; i ++) {
			// put the nearby two in
			Cell cur = pq.poll();
			if (cur.aIndex + 1 < aLen) {
				Cell tmp = new Cell(cur.aIndex + 1, cur.bIndex, A[cur.aIndex+1] + B[cur.bIndex]);
				if (!set.contains(tmp)) {
					set.add(tmp);
					pq.offer(tmp);
				}
				
			}
			if (cur.bIndex + 1 < bLen) {
				Cell tmp = new Cell(cur.aIndex, cur.bIndex+1, A[cur.aIndex] + B[cur.bIndex+1]);
				if (!set.contains(tmp)) {
					set.add(tmp);
					pq.offer(tmp);
				}
			}
			
		}
		
		return pq.peek().sum;
	}

}
