/*
 * Filename:    Diving.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        10/31/2019
 * Assignment:  Lab 9
 * Description: Take scores from a file and process them and display their score
 */
import java.util.*;
import java.io.*;

public class Diving {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("DiveData.txt"));
		printIntro();
		processDives(fileScanner);
	}

	// Print intro with correct spacing
	public static void printIntro() {
		System.out.println("Welcome to the Diver Scoring program. This program will calculate an");
		System.out.println("  overall score for a diver, based on individual dives.\n");
	}
	// Read one line and send it to calculateDiveScore for processing and print the results
	public static void processDives(Scanner fileScanner) {
		double diveAverage = 0.0;
		int dummyDiveCount = 0;
		

		while (fileScanner.hasNextLine()) {
			int diveCount = fileScanner.nextInt();
			String line = fileScanner.nextLine();
			double diverScore = calculateDiveScore(line);
			diveAverage += diverScore;
			dummyDiveCount++;
			System.out.printf("The diver's score for dive %d is %.2f.\n", diveCount, diverScore);
		}
		
		diveAverage /= dummyDiveCount;
		System.out.printf("\nThe average score for these dives is %.2f.\n", diveAverage);
	}

	public static double calculateDiveScore(String diveLine) {
		// Initialize the scanner for the line
		Scanner lineScanner = new Scanner(diveLine);
		
		// Store the difficulty number, initialize the diverScore as 0, and set the biggest and smallest scores to unobtainable scores, -1.0 and 11
		double difficultyNum = lineScanner.nextDouble(), diverScore = 0.0, biggestScore = -1.0, smallestScore = 11.0;
		
		// Read 7 scores and add them while looking for an updated biggestScore and smallestScore
		for (int i = 1; i <= 7; i++) {
			double currentScore = lineScanner.nextDouble();
			diverScore += currentScore;
			biggestScore = Math.max(biggestScore, currentScore);
			smallestScore = Math.min(smallestScore, currentScore);
		}
		
		diverScore = (diverScore - biggestScore - smallestScore) * difficultyNum * 0.6;
		return diverScore;
	}
}