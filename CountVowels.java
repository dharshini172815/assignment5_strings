package assignment5_strings;

import java.util.Scanner;
public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to count vowels: ");
		String str = sc.nextLine();
		int count = 0;
		String s = str.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Total vowels in given string: " +count);
	}

}
