/* 
 * Created by David Chiang
 * recursiveFactorial.java
 * Simple Factorial program using recursion 
 * 
 */


import java.util.Scanner;

public class recursiveFactorial {
	public static int resursionFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * resursionFactorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		int number;
		System.out.println("Please enter your positive number: ");
		number = IN.nextInt();
		int result = resursionFactorial(number);
		System.out.println("You entered: " + number);
		System.out.println("Factorial for " + number + " is " + result);
		IN.close();
	}

}
