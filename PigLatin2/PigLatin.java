/*
 * Filename:    PigLatin.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        10/23/2019
 * Assignment:  Lab 8
 * Description: Take a phrase from the user and convert it into Pig Latin
 */
import java.util.*;

public class PigLatin {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program will convert an English phrase into Pig Latin.\n");

		String inputPhrase = readPhrase(console);
		System.out.println();

		String pigLatinPhrase = convertPhrase(inputPhrase);
		printResult(inputPhrase, pigLatinPhrase);
	}
	
	// Prompts user for phrase and returns it
	public static String readPhrase(Scanner console) {
		System.out.print("Please enter a phrase ==> ");
		return console.nextLine();
	}
	
	// Takes phrase from readPhrase and parses the tokens to send to convertWord function
	public static String convertPhrase(String englishPhrase) {
		Scanner lineScanner = new Scanner(englishPhrase);
		// Declare pigLatinPhrase with the first "post" of the first word so there's no trailing whitespace
		String pigLatinPhrase = convertWord(lineScanner.next());
		
		// While there's still words in the string, send the next word to the convertWord function
		while(lineScanner.hasNext()) {
			String pigLatinWord = convertWord(lineScanner.next());
			pigLatinPhrase = (pigLatinPhrase + " " + pigLatinWord);
		}
		return pigLatinPhrase;
	}
	
	// Takes individual words and converts them to pig latin
	public static String convertWord(String englishWord) {
		char firstChar = englishWord.charAt(0);

		if (isVowel(firstChar)) {
			// If the first letter is a vowel, simply add -way
			String pigLatinWord = (englishWord + "-way");
			return pigLatinWord;
		} else if (englishWord.startsWith("th") || englishWord.startsWith("Th") || englishWord.startsWith("tH") || englishWord.startsWith("TH")) {
			// If the word starts with any variance of "Th", then modify the string and make it "-thay"
			String pigLatinWord = englishWord.substring(2);
			pigLatinWord = (pigLatinWord + "-" + englishWord.substring(0, 2) + "ay");
			return pigLatinWord;
		} else {
			// If the word doesn't start with Th or a vowel, concatinate the first character and -ay
			String pigLatinWord = (englishWord.substring(1) + "-" + firstChar + "ay");
			return pigLatinWord;
		}
	}
	
	// To be used by convertWord to see if the first letter is a vowel
	public static boolean isVowel(char c) {
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}
	}
	
	// Prints results and from the convertPhrase function
	public static void printResult(String englishPhrase, String pigLatinPhrase) {
		System.out.println("\"" + englishPhrase + "\"");
		System.out.println("  in Pig Latin is");
		System.out.println("\"" + pigLatinPhrase + "\"");
	}
}
