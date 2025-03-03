package assignment5_strings;
import java.util.Scanner;
public class CheckEmail {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an email address: ");
        String email = sc.nextLine();

        // Validate email
        if (isValidEmail(email)) {
            System.out.println("Valid email address ✅");
        } else {
            System.out.println("Invalid email address ❌");
        }
    }
	    public static boolean isValidEmail(String email) {
	        int atIndex = email.indexOf('@');
	        if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
	            return false; 
	        }
	        String localPart = email.substring(0, atIndex);
	        String domainPart = email.substring(atIndex + 1);

	        int dotIndex = domainPart.indexOf('.');
	        if (dotIndex <= 0 || dotIndex == domainPart.length() - 1) {
	            return false; 
	        }

	        if (localPart.isEmpty() || domainPart.isEmpty()) {
	            return false;
	        }

	        return true; 
	    }

}
