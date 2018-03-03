package algorithms.maths;

public class BinarySearch {

	public static int indexOf(int[] array, int key) {
		int lo = 0;
		int hi = array.length-1;
		
		while(lo <= hi) {
			// middle of array + first index
			int mid = lo + (hi-lo)/2;
			if(key < array[mid]) {
				hi = mid-1;
			} else if(key > array[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
			
		}
		return -1;
	}
	
	public static int euclidsAlgorithm(int p, int q) {
		if(q == 0) 
			return p;
		int r = p%q;
			return euclidsAlgorithm(q, r);
	}
}
