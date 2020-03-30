package week2;
//Create a program with a for loop that doubles a penny every day for 30 days
//
//Once complete, convert your answer from pennies to dollars and display the total after 30 days.

public class Pennies {

	public static void main(String[] args) {

		double penny = 0.01;
		
		for(int i=1; i<=30; i++) {
			System.out.println("Day " + i + " total: $" + penny);
			penny=penny*2;
		}

	}

}
