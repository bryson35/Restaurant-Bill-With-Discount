/*@author Bryson White
 * @version 10.30.19
 * This method is used to swap two variables using a method
 * 
 * Using a pass-by-value is useful because the value of the variable is not affected 
 * when you change the parameter. The value of the variable is passed to the parameter
 * 
 */

import java.util.*;
public class TestPassByValue {
	// Main Method
	public static void main(String args[]) {
		System.out.println("ID002");
		
		//Declare and initialize variables
		int num1 = 1;
		int num2 = 2;
		
		System.out.println("Before invoking the swap method, num1 is " +
		num1 + " and num2 is " + num2);
		
		// Invoke the swap method to attempt to swap two variables
		swap (num1, num2);
		
		System.out.println("After invoking the swap method, num1 is " +
		num1 + " and num2 is " +num2);	
	}
	
	//Swap two variables
	public static void swap (int n1, int n2) {
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping, n1 is " + n1
				+ " and n2 is " + n2);
		
		//Swap n1 with n2
		int temp = n1;
		n1 = n2;
		n2 = temp;//swaps n2 with n1
		
		System.out.println("\t\tAfter swapping, n1 is " + n1
				+ " and n2 is " + n2);
		

	}

}
