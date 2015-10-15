/* 
 * Created by David Chiang
 *palindromeCheck.java
 * To check if the word is palindrome or not
 * Recursion Practice
 * 
 */

import java.util.Scanner;

public class palindromeChecker {
	public static boolean palindromeCheck(String str){
		//To check the input string length. If no letter or 1 letter means it is palindrome
		if (str.length() <= 1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length()-1)){
			return palindromeCheck(str.substring(1, str.length()-1));
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		String word;
		System.out.println("Please enter the string you want to check for the palindrome: ");
		word = In.next();
		System.out.println("Your input for word is: " + word);
		boolean result = palindromeCheck(word);
		if (result == true) {
			System.out.println("Your input for word is palindrome" );
		} else {
			System.out.println("Your input for word is not palindrome" );
		}
		In.close();
	}

}
