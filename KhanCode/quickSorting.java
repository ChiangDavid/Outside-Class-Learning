/* 
 * Created by David Chiang
 * quickSorting.java
 * Sorting Algorithm: Quick Sort
 * Sorting Algorithm practice
 * 
 */


public class quickSorting {
	public static void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	
	public static void quickSort(int[] array, int left, int right) {
		//Assign the variable for left and right 
		int i = left;
		int j = right;
		//Take the value of middle array for the pivot value
		int pivotValue = array[(left+right)/2];
		//Processing to sort the data
		while(i < j) {
			//Means that the value already less than pivotValue
			while(array[i] < pivotValue) {
				//Increase by i
				i++;
			}
			//Means that the value already greater than pivotValue
			while(array[j] > pivotValue) {
				//Decrease by 1 
				j--;
			}
			//Otherwise, swap the data
			if (i <= j) {
				swap(array,i,j);
				i++;
				j--;
			}
		}
		//Because we are doing the segment of the data
		if (left < j) {
			//Call the quickSort again
			quickSort(array,left,j); 
		}
		//Because we are doing the segment of the data
		if (i < right) {
			//Call the quickSort again
			quickSort(array,i,right); 
		}
	}
		
	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" [ " + array[i] + " ] ");
		}
	}
	public static void main(String[] args) {
		int[] data = new int[] {9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6};
		System.out.println("Unsorted Array: ");
		display(data);
		quickSort(data,0,data.length-1);
		System.out.println();
		System.out.println("sorted Array: ");
		display(data);
		
	}
}
