/* 
 * Created by David Chiang
 * subArray.java
 * 
 * Program will return the smallest value inside the sub-array.
 * Ex.	If you give the starting index of 2. The program will return the smallest value 
 * 	   	from index 2 to the end of index-1.
 */

public class subArray {
	public static int indexOfMinimum(int[] a, int startIndex) {
		// Set initial values for minValue and minIndex,
	    // based on the leftmost entry in the subarray: 
		int minValue = a[startIndex];
		int minIndex = startIndex;
		
		// Loop over items starting with startIndex, 
	    // updating minValue and minIndex as needed:
		for (int i = minIndex + 1; i < a.length; i++) {
			if (a[i] < minValue) {
				minValue = a[i];
            	minIndex = i;
    			//To check and make sure we do the right thing for if statement
            	//System.out.println("Value for that index is : " + a[i]);
    			//System.out.println("Index for that Value is : " + minIndex);
			}
			//We can use this to check the loops for each Index and Value
			//System.out.println("Value: " + a[i] + " --> has Index of " + i);
		}
		//Return the minIndex
		return minIndex;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created the array
		int[] testArray = { 18, 6, 66, 44, 9, 22, 14 };
		//Loop though the array for each elements 
		System.out.println("Elements in array are: ");
		for (int i = 0; i < testArray.length; i++){
			//Prints out
			System.out.print("{ " + testArray[i] + " }");
			
		}
		System.out.print("\n");
		//Use the above method
		int min = indexOfMinimum(testArray, 2);
		System.out.println("The index of the minimum value of the subarray starting at index 2 is " + min + "."  );
		
	}

}
