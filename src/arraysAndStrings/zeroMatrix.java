package arraysAndStrings;

public class zeroMatrix {
	public static void replaceZero(int[][] matrix) {
		boolean isCol = false;
		int row = matrix.length;
		int col = matrix[0].length;
		
		// Traversing first row
		for (int i=0; i<col; i++) {
			if (matrix[0][i] == 0) {
				matrix[0][0] = 0;
			}
		}
		// Traversing first column
		for (int i=0; i<row; i++) {
			if (matrix[i][0] == 0) {
				isCol = true;
				break;
			}
		}
		
		// Check for zeros in rest of the matrix and mark their corresponding row and col by 
		// making first row and first column value = 0
		for (int i=1;i<row;i++) {
			for (int j=1;j<col;j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		// if zero found in first row in any column make all the values in that column to be zero
		for (int i=1; i<col; i++) {
			if (matrix[0][i] == 0) {
				for (int j=1; j< row; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		
		// if zero found in first column in any row make all the values in that row to be zero
		for (int i=1; i<row; i++) {
			if (matrix[i][0] == 0) {
				for (int j=1; j< col; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		// if first element is 0 then mark the first row as 0
		if (matrix[0][0] == 0) {
			for (int i=1; i<col; i++) {
				matrix[0][i] = 0;
			}
		}
		
		// if first column has zero mark all the first column element to be zero
		if (isCol) {
			for (int i=0; i<row; i++) {
				matrix[i][0] = 0;
			}
		}
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
}
