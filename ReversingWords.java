package assignment5_strings;
import java.util.Scanner;
public class ReversingWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String reversed = "";
		String[] words = sentence.split(" ");
		for(int i=words.length-1; i>=0; i-- ) {
			reversed += words[i]+ " ";
		}
		System.out.println("Reversed Sentence: " );
		System.out.println(reversed);

	}

}
