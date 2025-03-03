package assignment5_strings;

import java.util.Scanner;
public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		String result ="";
		for(int i=0; i<words.length; i++) {
			if(!words[i].isEmpty()) {
				char firstchar = words[i].charAt(0);
				if(firstchar >= 'a' && firstchar <='z') {
					firstchar = (char)(firstchar-32);
				}
				result+=firstchar+words[i].substring(1)+ " ";
			}
		}
		System.out.println("Result: ");
		System.out.println(result);

	}

}
