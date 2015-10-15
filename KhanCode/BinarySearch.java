/*
 *  Created by David Chiang
 * BinarySearch.java 
 *
 * Binary Search program practice without using recursion
 * 
 */


public class BinarySearch {
	public static int BinarySearching(int[] a, int targetValue) {
	//create and set the min value at start of the array
	int min = 0;
	//create and set the max value at end of the array
	int max = a.length - 1;
	//create mid point variable
	int mid; 
	//Set count to show how many times we guess
	int count = 0;
	//While loop to control when to stop the program
	while(min <= max) {
		//increment 1 each time we go into the loop
		count += 1;
		//Divide the array into half
		mid = (min + max) / 2;
		//Keep track of the mid 
		System.out.println("mid position at index: " + mid);
		//if we lucky enough to get the number at the first divide into half
		if (a[mid] == targetValue){
			//print out how many times
			System.out.println("You Tried: " + count + " Times to find what you want!");
			//just return the value
			return mid;
			//If the target value is greater than mid, we need to move min after the mid point
		} else if (a[mid] < targetValue){
			//set the min point to 1 after mid point
			min = mid + 1;
			//or If the target value is less than mid, we need to move max point before the mid point
		} else {
			//set the max value to 1 before mid point
			max = mid - 1;
		}
	}
	return -1;
}
	//program main
	public static void main(String[] args) {
		//create the array with numbers
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
	      		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		//Use the function define above
		int result = BinarySearching(primes,73);
		//Print out the index that we fined
		System.out.println("Find The prime at index: " + result);
	}

}
