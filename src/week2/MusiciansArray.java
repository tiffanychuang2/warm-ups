//Ask the user for their 5 favorite bands/musicians...store these in an array. Display the results in reverse order of how they were entered by the user.

package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class MusiciansArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<String> artists = new ArrayList<String>();
		String artist = input.nextLine();
		
		System.out.println("List 5 of your favorite bands or musicians.");
		artists.add(artist);
	}

}
