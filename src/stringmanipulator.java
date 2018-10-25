import java.util.Scanner;

public class stringmanipulator {

	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type a string.");
		String str = input.nextLine();
		System.out.println("The length of the string is " + str.length() + ".");
		System.out.println("The first character is " + str.charAt(0) + ", and the last character is " + str.charAt(str.length() - 1) + ".");
		System.out.println("The first half of the string is " + str.substring(0, str.length() / 2));
		System.out.println("Please enter a character you would like to search for");
		String charSearch = input.nextLine();
		
		
		
	}
	
}
