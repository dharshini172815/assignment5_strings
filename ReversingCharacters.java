package assignment5_strings;
import java.util.Scanner;
public class ReversingCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		String reversed = "";
		for(int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("Reversed String: " +reversed);

	}

}
