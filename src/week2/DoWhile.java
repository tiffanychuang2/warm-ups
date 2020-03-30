package week2;
//Create a program with a do-while loop that prints all multiples of 5 from 0 to 100 inclusive.

public class DoWhile {

	public static void main(String[] args) {
		
		int i=0;
		
		do {
			System.out.println(i);
			i+=5;
			
		} while(i>=0 && i<=100);

	}

}
