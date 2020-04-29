/* Filename:    MusicLibrary.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 (Section 01)
 * Date:        December 4th 2019
 * Assignment:  Lab 11
 * Description: A simple MusicLibrary class which manages a collection of Songs
 */
import java.util.Scanner;

public class MusicLibrary {
	
	Song[] songs;
    
    // Constructor for MusicLibrary
    public MusicLibrary(Scanner fileScanner) {
    	int numOfSongs = fileScanner.nextInt();
    	songs = new Song[numOfSongs];
    	fileScanner.nextLine();
    	
    	for (int i = 0; i < numOfSongs; i++) {
    		String[] line = fileScanner.nextLine().split(":");
    		songs[i] = new Song(line[1], line[2], Integer.parseInt(line[0]));
    	}
    }
    
    // Prints music library object as a nicely formatted table
    public void print() {
    	System.out.println("TITLE                   ARTIST                  TIME");
		System.out.println("-----                   ------                  ----");
		
		for(int i = 0; i < songs.length; i++) {
			songs[i].print();
		}
    }
    
    // Returns an integer of the total time of all the songs
    public int getTotalTime() {
    	int totalTime = 0;
        for(int i = 0; i < songs.length; i++) {
        	totalTime += songs[i].length;
        }
        return totalTime;
    }
    
    // Returns a Song object of the longest song in the library
    public Song getLongestSong() {
    	Song longestSong = songs[0];
		for (int i = 0; i < songs.length; i++) {
			if (longestSong.length < songs[i].length) {
				longestSong = songs[i];
			}
		}
		return longestSong;
    }
    
    // Returns a Song object of the shortest song in the library
    public Song getShortestSong() {
    	Song shortestSong = songs[0];
		for (int i = 0; i < songs.length; i++) {
			if (shortestSong.length > songs[i].length) {
				shortestSong = songs[i];
			}
		}
		return shortestSong;
    }
}
