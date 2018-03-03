package algorithms.maths;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] array = new double[]{0,1,2,3,4,5,6,7,8,9};
		System.out.println(ArrayProcessing.max(array));
		System.out.println(ArrayProcessing.avg(array));
		ArrayProcessing.reverse(array);
		System.out.println(Arrays.toString(array));
		
		//       		(3 1)
		//				(2 1)
		//
		//
		// (1  0)		(1*3 + 0*2		1*1 + 0*1)    ==>	(3	1)
		// (-1 3)		(-1*3 + 2*3		-1*1 + 3*1)			(3	2) 
		double[][] hMatrix = new double[2][2];
		hMatrix[0][0] = 1;
		hMatrix[0][1] = 0;
		hMatrix[1][0] = -1;
		hMatrix[1][1] = 3;
		
		double[][] vMatrix = new double[2][2];
		vMatrix[0][0] = 3;
		vMatrix[0][1] = 1;
		vMatrix[1][0] = 2;
		vMatrix[1][1] = 1;
		
		double[][] rMatrix = ArrayProcessing.multiplicationSquareMatrices(vMatrix, hMatrix);
		ArrayProcessing.printQuaredMatrix(rMatrix);
		System.out.println(Arrays.deepToString(rMatrix));
	}

}
