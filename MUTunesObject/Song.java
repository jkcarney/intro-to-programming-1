/* Filename:    Song.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 (Section 01)
 * Date:        December 4th 2019
 * Assignment:  Lab 11
 * Description: A simple Song class used for a Music Library
 */
public class Song {

	String title;
	String artist;
	int length;
	
	// Constructor for Song object
	public Song(String trackTitle, String trackArtist, int trackLength) {
		title = trackTitle;
		artist = trackArtist;
		length = trackLength;
	}

	// Prints song objects in a nicely formatted way
	public void print() {
		System.out.printf("%-24s%-24s%4d\n", title, artist, length);
	}
}
