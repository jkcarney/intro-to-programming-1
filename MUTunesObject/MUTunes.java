/* Filename:    MUTunes.java
 * Author:      Joshua Carney
 * Course:      CSCI 161
 * Date:        December 4 2019
 * Assignment:  Lab 11
 * Description: MUTunes driver
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MUTunes {
	
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Music.txt"));
        
        fixSpacing(sc);
        
    }
    
    public static void fixSpacing(Scanner fileScanner) {
    	String finalPrint = "";
    	while(fileScanner.hasNextLine()) {
    		Scanner lineScanner = new Scanner(fileScanner.nextLine());
    		while(lineScanner.hasNext()) {
    			finalPrint += lineScanner.next() + " ";
    		}
    		finalPrint += "\n";
    	}
    	System.out.print(finalPrint);
    }
}