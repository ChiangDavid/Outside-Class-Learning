/* 
 * Created by David Chiang
 * mergeSort.java
 * 
 * The program will perform the Merge Sort
 * 
 */

public class mergeSort {
	// Sort an array using a simple but inefficient merge sort. 
	public int[] mergeSortSimple( int[] data ){
	//we know that if the array less than 2 number, we dont have to sort them
	if( data.length < 2 ){ 
		return data;
	}
	// Split the array into two subarrays of approx equal size.
	int mid = data.length / 2;
	//create the left array of size mid 
	int[] left = new int[ mid ];
	//create the right array of size data.length - mid;
	//Ex. If data = 8, 8/2 = 4. Then, 8 - 4 = 4. ---> 4 is for right array
	int[] right = new int[ data.length - mid ];
	//Copy the array from data start at 0 to left array from 0
	//System.arraycopy( data, 0, left, 0, left.length ); 
	for (int i = 0; i < left.length; i++) {
		left[i] = data[i];
		//System.out.print(" [ " + "Left Array:" + left[i] + " ] ");
	}
	//Copy the array from data start at mid index to right array from 0
	for (int j = mid; j < data.length; j++) {
		right[j-mid] = data[j];
		//System.out.print(" [ " + "Right Array:" + right[j-mid] + " ] ");
	}
	// Sort each subarray, then merge the result.
	mergeSortSimple(left); 
	mergeSortSimple(right);
	return merge( data, left, right ); 
	}
	
	
	// Merge two smaller arrays into a larger array.
	private int[] merge( int[] dest, int[] left, int[] right ) {
	int destindex = 0; 
	int leftindex = 0; 
	int rightindex = 0;
	// Merge arrays while there are elements in both 
	while ( leftindex < left.length && rightindex < right.length ){
		if ( left[ leftindex ] <= right[ rightindex ] ) { 
			dest[ destindex++ ] = left[ leftindex++ ];
		} else {
			dest[ destindex++ ] = right[ rightindex++ ]; 
			}
	//Copy rest of whichever array remains
		while (leftindex < left.length ) {
			dest[ destindex++ ] = left[ destindex++ ];
		}
		while ( rightindex < right.length ) {
			dest[ destindex++ ] = right[ rightindex++ ];
			}
		}
	return dest;
	}
}

