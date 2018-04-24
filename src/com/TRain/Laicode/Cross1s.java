package com.TRain.Laicode;

public class Cross1s {
	public int largest(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] leftToIndex = new int[row][col]; // left to index
		int[][] rightToIndex = new int[row][col]; // right to index
		int[][] horMin = new int[row][col];
		int[][] topToIndex = new int[row][col];
		int[][] botToIndex = new int[row][col];
		int[][] verMin = new int[row][col];
		int max = 0;
		for (int i = 0; i < row; i ++) {
			leftToIndex[i][0] = matrix[i][0] == 1?1:0;
			rightToIndex[i][col - 1]  = matrix[i][col - 1] == 1?1:0;
			for (int j = 1; j < col; j ++) {
				leftToIndex[i][j] = matrix[i][j] == 1?leftToIndex[i][j-1] + 1:0;
				rightToIndex[i][col - 1 - j] = matrix[i][col - 1- j] == 1?rightToIndex[i][col - j] + 1:0;				
			}
			for (int j = 0; j < row; j ++) {
				horMin[i][j] = Math.min(leftToIndex[i][j], rightToIndex[i][j]);
			}
		}
		for (int i = 0; i < col; i++) {
			topToIndex[0][i] = matrix[0][i] == 1?1:0;
			botToIndex[row-1][i] = matrix[row - 1][i] == 1?1:0;
			for (int j = 1; j < row; j ++) {
				topToIndex[j][i] = matrix[j][i] == 1?topToIndex[j-1][i] +1:0;
				botToIndex[row - j - 1][i] = matrix[row-j - 1][i] == 1?botToIndex[row-j][i] + 1:0;
			}
			for (int j = 0; j < row; j++) {
				verMin[j][i] = Math.min(topToIndex[j][i], botToIndex[j][i]);
			}
			
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				max = Math.max(max, Math.min(horMin[i][j], verMin[i][j]));
			}
		}
		return max;
		
	}
	

}
