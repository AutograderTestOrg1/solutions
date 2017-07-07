package oving1;

import java.util.Scanner;

public class Kroppsmasseindeks {

	/*
	 * Løsning oppgave b, e og f. Dette er løsning for oppgave b, bortsett fra de blokkene
	 * med oppgave e og oppgave f kommentert.
	 */
	public static void main(String[] args) {
		// Lager variablene først for å få programmet mer oversiktlig
		Scanner inn = new Scanner(System.in);
		double hoyde;
		double vekt;
		double bmi;
		
		// Leser inn høyde
		System.out.println("Skriv inn høyde i centimeter: ");
		hoyde = inn.nextDouble();
		
		// Oppgave f. Sjekker for ulovlig høyde og lar bruker skrive inn på nytt
		// hvis høyden er ulovlig
		while (hoyde <= 0) {
			System.out.println("Ulovlig høyde! Prøv igjen.");
			System.out.println("Skriv inn høyde i centimeter: ");
			hoyde = inn.nextDouble();			
		}

		// Skriver inn vekt
		System.out.println("Skriv inn vekt i kilo: ");
		vekt = inn.nextDouble();

		// Oppgave e. Sjekker om vekt er lovlig
		if (vekt <= 0) {
			System.out.println("Ulovlig vekt! Avslutter.");
			return; // Avslutter main() metoden, og avslutter dermed programmet
		}
		
		// Regner ut BMI
		bmi = vekt/((hoyde/100.0)*(hoyde/100.0));
		
		// Skriver ut BMI med 2 siffer bak komma
		System.out.printf("Din BMI er: %6.2f %n", bmi);
	}

}
