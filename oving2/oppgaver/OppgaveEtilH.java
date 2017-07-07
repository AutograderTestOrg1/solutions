package oppgaver;


import java.util.Scanner;

/*
 * Oppgave e-h
 */
public class OppgaveEtilH {
	
	// Oppgave e)
	public static boolean erDeleligMed(int tallet, int delelig) {	
		if (tallet % delelig == 0) {
			return true;
		} else return false;
	}
	
	// Oppgave f)
	public static int minsteDivisor(int tallet) {
		for (int teller = 2;teller <= tallet;teller++) {
			if (erDeleligMed(tallet, teller)) {
				return teller;
			}
		}
		return -1;
	}
	
	// Oppgave h)
	public static boolean erPrimtall(int tallet) {
		int divisor;
		divisor = minsteDivisor(tallet);
		if (divisor == tallet) {
			return true;
		} else return false;
	}

	/*
	 * Oppgave g)
	 * 
	 * Merk at det ikke er et krav for studentene å lese inn tallene fra brukeren, men å lese inn tallene slik gjør
	 * testing enklere da du ikke trenger å endre programmet for hver test.
	 */
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		int tallet;
		int testdelelig;
		int divisor;
		
		System.out.print("Skriv inn tallet: ");
		tallet = inn.nextInt();
		System.out.print("Test delelig: ");
		testdelelig = inn.nextInt();
		if (erDeleligMed(tallet, testdelelig)) {
			System.out.println(tallet + " er delelig med " + testdelelig);
		} else {
			System.out.println(tallet + " er ikke delelig med " + testdelelig);			
		}
		
		divisor = minsteDivisor(tallet);
		System.out.println("Minste divisor for: " + tallet + " er " + divisor);
		
		if (erPrimtall(tallet)) {
			System.out.println("Tallet " + tallet + " er et primtall");
		} else {
			System.out.println("Tallet " + tallet + " er ikke et primtall");			
		}
	}

}
