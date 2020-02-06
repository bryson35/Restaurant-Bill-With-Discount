/*@author Bryson White
 * @version 11.7.19
 * This program is used to calculate the area of a polygon
 * 
 * Pseudocode:
 * START
 * MAIN METHOD
 * Ask user to enter number of sides
 * Ask user to enter length of side
 * Using a method, calculate the area of the polygon 
 * DISPLAY the are of the polygon
 *END
 */
import java.util.*;
public class post07 {
	public static void main(String args[]) {
		System.out.println("ID001");
		
		Scanner input = new Scanner(System.in);
		
		//number of sides of polygon
		System.out.println("Enter the number of sides: ");
		int sides = input.nextInt();
		System.out.println("Enter the length of the side: ");
		double length = input.nextDouble();
		
		System.out.println("The area of the polygon is " + area(sides,length));//use method from below
	}
	
	/** Calculate the area of a polygon */
	public static double area(int n, double side) {
		double angle = Math.toRadians(180/n);//converts to radians
		angle = Math.tan(angle);
		double area = ((side*side*n)/(4*angle));//formula for area of polygon
		return area;
	}
	
}
