import java.util.*;
public class challenge {
	public static void main(String args []) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String s1 = input.nextLine();
		
		if (s1.contains("want to buy")) {
			int want = s1.indexOf("want to buy a");
			String s2 = s1.substring(want+14,s1.length());
			int want2 = s1.indexOf(s2);
			
			
			System.out.println("Would you be happy if you bought a " + s2+ "?");
		
			
		}
		
		
		
		
		
		
	}

}
