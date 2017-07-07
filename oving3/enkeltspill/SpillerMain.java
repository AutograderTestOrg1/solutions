package enkeltspill;

import java.util.Scanner;

// Inneholder oppgave f) og oppgave h)
public class SpillerMain {

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.print("ID til spilleren: ");
		int id = inn.nextInt();
		System.out.print("Navn til spilleren: ");
		inn.nextLine();
		String navn = inn.nextLine();
		
		Spiller spiller1 = new Spiller(id, navn);
		
		
		System.out.print("ID til spilleren: ");
		id = inn.nextInt();
		System.out.print("Navn til spilleren: ");
		inn.nextLine();
		navn = inn.nextLine();
		Spiller spiller2 = new Spiller(id, navn);
		
		spiller1.skrivUtSpiller();
		System.out.print("Poengsum for denne spilleren: ");
		int poeng = inn.nextInt();
		spiller1.setPoengsum(poeng);
		
		spiller2.skrivUtSpiller();
		System.out.print("Poengsum for denne spilleren: ");
		poeng = inn.nextInt();
		spiller2.setPoengsum(poeng);
		
		Spiller mestPoeng = Spiller.hoyestPoengsum(spiller1, spiller2);
		System.out.println("Spilleren med flest poeng: ");
		mestPoeng.skrivUtSpiller();
	}

}
