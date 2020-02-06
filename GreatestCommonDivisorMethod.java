/*@author Bryson White
 * @10.30.19
 * This program is used to find the greatest common divisor using a method
 * 
 */
import java.util.*;

public class GreatestCommonDivisorMethod {
	//Main Method
	public static void main(String args[]) {
		//Create scanner
		Scanner input = new Scanner(System.in);
		System.out.println("ID003");
		
		//Prompt the user to enter two integers
		System.out.println("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for " + n1 + 
				" and " + n2 + " is " + gcd(n1, n2));
	}
	
	// Return the gcd of two integers
	public static int gcd(int n1, int n2) {
		int gcd = 1; //initial gcd is 1
		int k = 2; //possible gcd
		
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k ==0) 
				gcd = k; //Update gcd
				k++;
		}
		return gcd; //Return gcd
	}

}
