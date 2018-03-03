package algorithms.maths;

public class TypicalFunction {

	public static int abs(int value) {
		if(value < 0)
			return -value;
		return value;
	}
	
	public static boolean isPrime(int value) {
		if(value < 2)
			return false;
		for(int i = 2; i*i <= value; i++) {
			if(value%i == 0)
				return false;
		}
		return true;
	}
	
	public static double hypotenuse(int valueA, int valueB) {
		return Math.sqrt(valueA*valueA + valueB*valueB);
	}
	
	public static double harmonic(int value) {
		double sum = 0.0;
		for(int i = 1; i <= value; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
}
