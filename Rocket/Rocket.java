/*
 * Filename:    DrawRocket.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        9/18/2019
 * Assignment:  Lab 4
 * Description: Draw an adjustable rocket size using nested for() loops
 */
public class Rocket {
	public static final int SIZE = 7;

	public static void main(String[] args) {
		drawCone();
		drawBody();
		drawCone();
	}

	public static void drawLine() {
		System.out.print("+");
		for (int i = 1; i <= SIZE * 2; i++) {
			System.out.print("=*");
		}
		System.out.print("+");
		System.out.println();
	}

	public static void drawCone() {
		for (int line = 1; line <= SIZE * 2 - 1; line++) {
			// Draw Spaces
			for (int space = 1; space <= ((-line) + SIZE * 2); space++) {
				System.out.print(" ");
			}
			// Draw Dashes
			for (int dash = 1; dash <= line; dash++) {
				System.out.print("/");
			}
			System.out.print("**");
			// Draw Backdashes
			for (int backdash = 1; backdash <= line; backdash++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}

	public static void drawBody() {
		drawLine();
		drawTriangles();
		drawInvertedTriangles();
		drawLine();
		drawInvertedTriangles();
		drawTriangles();
		drawLine();
	}

	public static void drawTriangles() {
		for (int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			// Print Teepees (/\)
			for (int teepee = 1; teepee <= line; teepee++) {
				System.out.print("/\\");
			}
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			// Print Teepees (/\)
			for (int teepee = 1; teepee <= line; teepee++) {
				System.out.print("/\\");
			}
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}

	public static void drawInvertedTriangles() {
		for (int line = SIZE; line >= 1; line--) {
			System.out.print("|");
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			// Print "V"s (\/)
			for (int v = 1; v <= line; v++) {
				System.out.print("\\/");
			}
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			// Print "V"s (\/)
			for (int v = 1; v <= line; v++) {
				System.out.print("\\/");
			}
			// Print Dots
			for (int dots = 1; dots <= (-line) + SIZE; dots++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}
