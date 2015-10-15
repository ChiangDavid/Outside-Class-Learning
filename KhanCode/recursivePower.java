/* 
 * Created by David Chiang
 * recursivePower.java
 * 
 * The program will raise the power by using recursive 
 * 
 */


import java.util.Scanner;

public class recursivePower {
	public static double power(double x, double n) {
		//Base case. Ex. 3^0 = 1;
		if (n == 0){
			return 1;
		} else if (n < 0){
			return 1/power(x,-n);
		}
		//If we have the 
		return x * power(x,n-1.0);
	}
	
	
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Please enter the integer number: ");
		double number = Input.nextDouble();
		System.out.println("Please enter the power you want to raised: ");
		double power = Input.nextDouble();
		double result = power(number,power);
		System.out.println("The result for " + number + " to the " + power + " is: " + result);
		Input.close();
		
	}

}
