package enkeltspill;

import java.util.Scanner;

public class SpillerMainOppgaveJogK {
	
	public static String sentenceCase(String teksten) {
		String forste = teksten.substring(0, 1);
		String resten = teksten.substring(1);
		forste = forste.toUpperCase();
		resten = resten.toLowerCase();
		String resultat = forste + resten;
		return resultat;
	}
	
	public static Spiller skrivInnSpiller(Scanner inn) {
		System.out.print("ID til spilleren: ");
		int id = inn.nextInt();
		System.out.print("Navn til spilleren: ");
		inn.nextLine();
		String navn = inn.nextLine();
		navn = sentenceCase(navn);
		
		Spiller spiller = new Spiller(id, navn);
		return spiller;
	}

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);

		Spiller spiller1 = skrivInnSpiller(inn);
		Spiller spiller2 = skrivInnSpiller(inn);
		
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
