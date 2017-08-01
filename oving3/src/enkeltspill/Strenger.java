package enkeltspill;

import java.util.Scanner;

public class Strenger {

	/*
	 * Oppgave a)
	 */
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.print("Skriv inn en streng: ");
		String original = inn.nextLine();
		String forste = original.substring(0, 1);
		String resten = original.substring(1);
		forste = forste.toUpperCase();
		resten = resten.toLowerCase();
		String resultat = forste + resten;
		System.out.println("Strengen i vanlig setnings-case er: ");
		System.out.println(resultat);
	}

}
