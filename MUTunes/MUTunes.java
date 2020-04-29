/*
 * Filename:    Diving.java
 * Author:      Joshua Carney
 * Course:      CSCI 161 Section 3
 * Date:        11/20/2019
 * Assignment:  Lab 10
 * Description: Read information on music from a file and display it in a nice looking table
 */
import java.util.*;
import java.io.*;

public class MUTunes {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner fileScanner = new Scanner(new File("Music.txt"));
		int numberOfSongs = fileScanner.nextInt();

		int[] songLengths = new int[numberOfSongs];
		String[] songTitles = new String[numberOfSongs];
		String[] songArtists = new String[numberOfSongs];

		fileScanner.nextLine();

		for (int i = 0; i < numberOfSongs; i++) {
			String[] line = fileScanner.nextLine().split(":");
			songLengths[i] = Integer.parseInt(line[0]);
			songTitles[i] = line[1];
			songArtists[i] = line[2];
		}
		printTable(songTitles, songArtists, songLengths);
		System.out.println("\nTOTAL TIME                                      " + getTotalTime(songLengths) + "\n");

		System.out.println("LONGEST SONG");
		System.out.println("------------");
		printSong(songTitles, songArtists, songLengths, longestSongIndex(songLengths));

		System.out.println("\nSHORTEST SONG");
		System.out.println("-------------");
		printSong(songTitles, songArtists, songLengths, shortestSongIndex(songLengths));

		System.out.println("\nSONGS");
		System.out.println("-----");
		Arrays.sort(songTitles);
		for (int i = 0; i < songLengths.length; i++) {
			System.out.println(songTitles[i]);
		}

	}

	public static void printTable(String[] songTitles, String[] songArtists, int[] songLengths) {
		System.out.println("TITLE                   ARTIST                  TIME");
		System.out.println("-----                   ------                  ----");

		for (int i = 0; i < songLengths.length; i++) {
			printSong(songTitles, songArtists, songLengths, i);
		}

	}

	public static void printSong(String[] songTitles, String[] songArtists, int[] songLengths, int zeroIndex) {
		System.out.printf("%-24s%-24s%4d\n", songTitles[zeroIndex], songArtists[zeroIndex], songLengths[zeroIndex]);
	}

	public static int getTotalTime(int[] songLengths) {
		int totalTime = 0;
		for (int i = 0; i < songLengths.length; i++) {
			totalTime += songLengths[i];
		}
		return totalTime;

	}

	public static int longestSongIndex(int[] songLengths) {
		int longest = 0;
		int indexOfLongest = 0;
		for (int i = 0; i < songLengths.length; i++) {
			if (longest < songLengths[i]) {
				indexOfLongest = i;
				longest = songLengths[i];
			}
		}
		return indexOfLongest;
	}

	public static int shortestSongIndex(int[] songLengths) {
		int shortest = 0;
		int indexOfShortest = 0;
		for (int i = 0; i < songLengths.length; i++) {
			if (songLengths[i] < shortest) {
				indexOfShortest = i;
				shortest = songLengths[i];
			}
		}
		return indexOfShortest;
	}
}
