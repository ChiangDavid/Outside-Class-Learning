/* 
 * Created by David Chiang
 * selectionSort.java
 * 
 * The program will perform the selection sort
 * 
 */


public class selectionSort {
	public static void swap(int[] a, int firstIndex, int secondIndex){
		int temp = a[firstIndex]; //First element in array
		a[firstIndex] = a[secondIndex]; //Now first element in array become second element
		a[secondIndex] = temp; //Now we make the second element to become first element
	}
	public static int indexOfMinimum(int[] a, int startIndex) {
		// Set initial values for minValue and minIndex,
	    // based on the leftmost entry in the subarray: 
		int minValue = a[startIndex];
		int minIndex = startIndex;
		
		// Loop over items starting with startIndex, 
	    // updating minValue and minIndex as needed:
		for (int i = minIndex + 1; i < a.length ; i++) {
			if (a[i] < minValue) {
				minValue = a[i];
				minIndex = i;
    			//To check and make sure we do the right thing for if statement
            	//System.out.println();
            	//System.out.println("Value for that index is : " + a[i]);
    			//System.out.println("Index for that Value is : " + minIndex);
			}
			//We can use this to check the loops for each Index and Value
			//System.out.println("Value: " + a[i] + " --> has Index of " + i);
		}
		//Return the minIndex
		return minIndex;
	}
	
	public static void selectionSorting(int[] a) {
		//loop through the array
		for (int i = 0; i < a.length-1; i++){
			//Create the variable call minNumIndex that store the index of smallest number
			int minNumIndex = indexOfMinimum(a,i);
			//Use swap function to swap the elements in the array
			swap(a,minNumIndex,i);
		}
	}
	
	
	public static void main(String[] args) {
		int[] array = {22, 11, 99, 30,88, 9, 7, 42,55};
		System.out.println("Array Before Sorting:");
		for (int i = 0; i < array.length; i++){
			System.out.print("{ " + array[i] + " }");
		}
		selectionSorting(array);
		System.out.println("\n");
		System.out.println("Array After Sorting:");
		for (int i = 0; i < array.length; i++){
			System.out.print("{ " + array[i] + " }" );
		}
	}

}
