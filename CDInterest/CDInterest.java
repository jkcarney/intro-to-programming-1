
/*
 * Filename:    CDInterest.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        10/2/2019
 * Assignment:  Lab 6
 * Description: Calculate interest on a CD over a specified period using user input.
 */

import java.util.*;

public class CDInterest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		printIntro();
		// Take user input
		System.out.print("Please enter the initial balance: ");
		double balance = console.nextDouble();
		System.out.print("Please enter the interest rate  : ");
		double rate = console.nextDouble();
		System.out.print("Please enter the number of years: ");
		int years = console.nextInt();
		System.out.println();

		printTable(years, balance, rate);
	}

	// Prints text at the beginning of the program
	public static void printIntro() {
		System.out.println("This program will calculate the interest earned");
		System.out.println("  on a CD over a period of several years.\n");
	}

	// Print table calling the printRow function for as many years inputted
	public static void printTable(int numRows, double balance, double rate) {
		System.out.println("Year     Balance     Interest     New Balance");
		System.out.println("----     -------     --------     -----------");
		

		// Loop calls printRow for each year and calculates new balance and interest
		for (int year = 1; year <= numRows; year++) {
			double interest = calcInterest(balance, rate);
			printRow(year, balance, interest);
			balance = balance + interest;	
		}
	}

	// Print and calculate values on each row of the table
	public static void printRow(int rowNum, double balance, double interest) {
		double newBalance = balance + interest;
		System.out.printf("%-4d%,12.2f%,13.2f%,16.2f\n", rowNum, balance, interest, newBalance);
	}

	// Calculate interest
	public static double calcInterest(double balance, double rate) {
		double interest = balance * (rate * 0.01);
		return interest;
	}

}
