package algorithms.maths;

public class ArrayProcessing {

	public static double max(double[] array) {

		double max = 0.0;
		if(array != null ) {
			int length = array.length;
			if(length > 0) {
				for (int i = 0; i < length; i++) {
					double currentValue = array[i];
					if (currentValue > max)
						max = currentValue;
				}
			}
		}
		return max;
	}
	
	
	public static double avg(double[] array) {

		double avg = 0.0;
		
		if(array != null) {
			int length = array.length;
			if(length > 0) {
				for(int i = 0 ; i < length; i++) {
					avg += array[i];
				}
				avg /= length;
			}
		}
		
		return avg;
	}
	
	
	public static void reverse(double[] array) {
		if(array != null) {

			int length = array.length;
			if(length > 0) {
				double tmp = 0;
				
				// Only iterate until the middle of the array
				for(int i = 0 ; i < length/2; i++) {
					tmp = array[i];
					array[i] = array[length-1-i];
					array[length-1-i] = tmp;
				}
			}
		}
	}
	
	public static double[][] multiplicationSquareMatrices(double[][] vMatrix, double[][] hMatrix) {
		if(vMatrix == null || hMatrix == null || vMatrix.length != hMatrix.length) {
			throw new IllegalArgumentException("Both of array must be initialized and have the same size");
		}
		int length  = vMatrix.length;
		double[][] rMatrix = new double[length][length];
		
		// For vertical iteration
		for(int i = 0; i < length; i ++) {
			for(int j = 0; j < length; j++) {
				for(int k = 0; k < length; k++) {
					// accumulate values on each row/column of vMatrix and hMatrix RM[0][0] = HM[0][0]*VM[0][0] + HM[0][1]*VM[1][0];
					rMatrix[i][j] += hMatrix[i][k] * vMatrix[k][j];
				}
			}
		}
		return rMatrix;
	}
	
	public static void printQuaredMatrix(double[][] matrix) {
		if(matrix != null) {
			
			int rLength = matrix.length;
			for(int r = 0 ; r < rLength ; r++) {
				int cLength = matrix[r].length;
				for(int c = 0 ; c < cLength ; c++) {
					System.out.print(matrix[r][c]);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
