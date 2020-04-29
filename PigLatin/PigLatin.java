
/*
 * Filename:    PigLatin.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        10/16/2019
 * Assignment:  Lab 7
 * Description: Take one token from the user and translate it to pig latin
 */

import java.util.*;

public class PigLatin {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program will convert an English word into Pig Latin.\n");
		String inputWord = readWord(console);
		System.out.println();
		String pigLatinWord = convertWord(inputWord);
		printResult(inputWord, pigLatinWord);

	}
	
	// Reads word from the user and returns input
	public static String readWord(Scanner console) {
		System.out.print("Please enter a word ==> ");
		String inputWord = console.next();
		
		return inputWord;
	}
	
	// Converts by testing if the word starts with a vowel or TH
	public static String convertWord (String englishWord) {
		char firstChar = englishWord.charAt(0);
		
		if(isVowel(firstChar)) {
			// If the first letter is a vowel, simply add -way
			String pigLatinWord = (englishWord + "-way");
			return pigLatinWord;
		} if(englishWord.startsWith("th") || englishWord.startsWith("Th") || englishWord.startsWith("tH") || englishWord.startsWith("TH")) {
			// If the word starts with any variance of "Th", then modify the string and make it "-thay"
			String pigLatinWord = englishWord.substring(2);
			pigLatinWord = (pigLatinWord + "-" +englishWord.substring(0,2) + "ay");
			return pigLatinWord;
		} else {
			// If the word doesn't start with Th or a vowel, concatinate the first character and -ay
			String pigLatinWord = (englishWord.substring(1) + "-" + firstChar + "ay");
			return pigLatinWord;
		}
	}
	
	// Checks to see if the first letter is a vowel and returns true/false
	public static boolean isVowel (char c) {		
		if (c == 'A' || c == 'E' || c == 'I' || c =='O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}
	}
	// Prints user inputted word and modified word in pig latin
	public static void printResult(String englishWord, String pigLatinWord) {
		System.out.println("\"" + englishWord + "\"");
		System.out.println("  in Pig Latin is");
		System.out.println("\"" + pigLatinWord + "\"");
	}


}
