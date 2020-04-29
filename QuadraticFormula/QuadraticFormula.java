
/*
 * Filename:    QuadraticFormula.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        9/25/2019
 * Assignment:  Lab 5
 * Description: Use return functions to calculate the quadratic formula given a, b, and c
 */
import java.util.*;

public class QuadraticFormula {

	public static void main(String[] args) {
		// Enable user input
		Scanner console = new Scanner(System.in);

		// Grab a, b, and c from the user
		System.out.print("a ==> ");
		int a = console.nextInt();
		System.out.print("b ==> ");
		int b = console.nextInt();
		System.out.print("c ==> ");
		int c = console.nextInt();
		System.out.println();

		printQuadraticRoots(a, b, c);

	}
	
	// Prints text except for equation and calculates the roots
	public static void printQuadraticRoots(int a, int b, int c) {
		System.out.print("For the equation \"");
		printEquation(a, b, c);
		System.out.println("\", the roots are");

		double discriminant = calcDiscriminant(a, b, c);
		double root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
		double root2 = (-b - Math.sqrt(discriminant)) / 2 * a;

		System.out.println("  x = " + root1);
		System.out.println(" and");
		System.out.println("  x = " + root2);
	}
	
	// Prints quadratic equation
	public static void printEquation(int a, int b, int c) {
		System.out.print("(" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0");
	}
	
	// Calculates discriminant to return to printQuadraticRoots function
	public static double calcDiscriminant(int a, int b, int c) {
		double discriminant = b * b - 4 * a * c;
		return discriminant;
	}
}
