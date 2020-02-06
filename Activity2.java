
/*@author Bryson White
 *@version 9/13/19
 *This program is used to add a discount to a customer based on their membership code, and then calculating the tax and total bill. 
 */
import java.util.*;
public class Activity2 {
public static void main(String args[]) {
	
Scanner input = new Scanner(System.in);
//ask user to input their membership code
System.out.println("Welcome! Please enter your membership year.");
int discount = (int)(Math.random()* 100);
int membership;
double d =0 , discount1, total, bill;
membership = input.nextInt();
//add switch to indicate which discount user will get based on the previous code

switch (membership) {

//if user enters 2014
case 2014:
System.out.println("You get a 15% discount.");
d = (double) .15;
break;

//if user enters 2015
case 2015:
System.out.println("You get a 10% discount. ");	

d = (double) .10;
break;

//if user enters 2016
case 2016:
System.out.println("You get a 5% discount. ");
d = (double) .05;
break;

//if user enters anything else
default:
System.out.println("Sorry, no discount.");
}


System.out.println("Enter your total bill: ");
bill = input.nextDouble();

//subtract the outcome of the first method from the second method
System.out.println("Your total bill is: " + calculateFinalPrice(bill, calculateDiscount(bill, d)) );

}


public static double calculateDiscount(double a, double b) {//calculates the discount
	double discount = a * b;
	return discount;//returns discount amount
}
	
public static double calculateFinalPrice(double a, double b) {//calculates total bill AFTER discount
	double finalPrice = a - b;
	return finalPrice;//returns final price
}

}

