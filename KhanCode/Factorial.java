/* Created by David Chiang
 * Factorial.java
 * Simple Factorial program without using recursion
 * 
 */



public class Factorial {
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++){
			result *= i;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("The factorial for 5 is: " + result);
	}

}
