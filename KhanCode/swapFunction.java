/* 
 * Created by David Chiang
 * Swap function 
 * Writing the swap function
 * 
 */

public class swapFunction {
	public static void swap(int[] a, int firstIndex, int secondIndex){
		int temp = a[firstIndex]; //First element in array
		a[firstIndex] = a[secondIndex]; //Now first element in array become second element
		a[secondIndex] = temp; //Now we make the second element to become first element
	}
	
	public static void main(String[] args) {
		//Create the array that contains 
		int[] a = { 7, 9, 4};
		for (int i = 0; i < a.length; i++){
			System.out.println("Array before swapping: " + a[i] +"\n" + "It is Index of: " + i);
		}
		
		swap(a, 0, 1);
		for (int i = 0; i < a.length; i++){
			System.out.println("Array after swapping: " + a[i] +"\n" + "It is Index of: " + i);
		}
		System.out.println();
		
		
	}
}
		
	

