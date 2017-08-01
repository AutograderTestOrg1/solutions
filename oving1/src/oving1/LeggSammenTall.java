package oving1;

import java.util.Scanner;

public class LeggSammenTall {
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		int tall = 0;
		int sum = 0;
		
		// Bruker en do --- while løkke siden programmet alltid skal lese inn minst
		// ett tall.
		do {
			System.out.print("Skriv inn et tall: ");
			tall = inn.nextInt();
			if (tall < 0) break;
			sum += tall;
			System.out.println("Summen er nå: " + sum);
		} while (tall > 0);
	}
}
