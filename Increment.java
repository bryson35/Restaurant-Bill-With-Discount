/*@author Bryson White
 * @version 10.30.19
 * 
 */

import java.util.*;
public class Increment {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("ID001");
		
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment(x);//uses the increment method
		System.out.println("After the call, x is " + x);
	}
	
	public static void increment(int n) {
		n++;//increments n
		System.out.println("n inside the method is " + n);
	}
}
