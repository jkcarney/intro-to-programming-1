/*
 * Filename:    Decomposition.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        9/4/2019
 * Assignment:  Lab 2
 * Description: Draws 3 figures using static methods
 */

public class Decomposition {

	public static void main(String[] args) {
		// Creates first figure
		drawFigure1();
		System.out.println();
		System.out.println();
		
		// Creates second figure
		drawFigure2();
		System.out.println();
		System.out.println();
		
		// Creates third figure
		drawFigure3();
	}

	// Draws basic line shape
	public static void drawLine() {
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
	}

	// Draws basic "disk" shape
	public static void drawDisk() {
		System.out.println("*****");
		System.out.println("*****");
	}

	// Draws basic "X" shape
	public static void drawX() {
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}

	// Draws the 1st figure
	public static void drawFigure1() {
		drawLine();
		drawDisk();
		drawX();
	}

	// Draws the 2nd figure
	public static void drawFigure2() {
		drawX();
		drawDisk();
		drawLine();
		drawDisk();
	}

	// Draws the 3rd figure
	public static void drawFigure3() {
		drawDisk();
		drawX();
	}
}
