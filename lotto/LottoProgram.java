package lotto;

import java.util.Scanner;

/*
 * två stycken Math.random() metoder för att få tvåsiffrigt tal
 * om jag har förstått rätt.  * 
 * 
 * visasr de två siffrorna för att testa programmet 
 * System.out.println(randomNumber1 + " " + randomNumber2 + " ");  * 
 * 
 */

public class LottoProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			int randomNumber1 = (int) (Math.random() * 100);
			int randomNumber2 = (int) (Math.random() * 100);

			// System.out.println(randomNumber1 + " " + randomNumber2 + " ");

			System.out.print("Skriv in din första nummmer: ");
			int numberGuess1 = input.nextInt();
			System.out.print("Skriv in din andra nummmer: ");
			int numberGuess2 = input.nextInt();

			System.out.println(numberGuess1 + " " + numberGuess2);

			if (numberGuess1 == randomNumber1 && numberGuess2 == randomNumber2) {
				System.out.print("Användaren har vunnit 10000 kr ");
				break;
			} else if (numberGuess1 == randomNumber2 && numberGuess2 == randomNumber1) {
				System.out.print("Användaren har vunnit 5000 kr ");
				break;
			} else if (numberGuess1 == randomNumber1 || numberGuess2 == randomNumber2) {
				System.out.print("Användaren har vunnit 1000 kr ");
			} else
				System.out.print("Användaren vann ingenting ");

			System.out.println("\nRätta numrerna är: ");

			System.out.println(randomNumber1 + " " + randomNumber2 + " ");
			break;
			
		}input.close();
	}
}
