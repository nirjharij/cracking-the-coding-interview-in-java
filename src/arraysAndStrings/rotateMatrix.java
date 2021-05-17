package arraysAndStrings;


public class rotateMatrix {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int loop=0; loop<n/2; loop ++) {
			int i = loop;
			int j = n - i - 1;
			for (int k = i; k < j; k++) {
				int offset = k - i;
				
				int temp = matrix[i][k];
				
				matrix[i][k] = matrix[j-offset][i];
				matrix[j-offset][i] = matrix[j][j-offset];
				matrix[j][j-offset] = matrix[k][j];
				matrix[k][j] = temp;
			}
		}
	}
}
