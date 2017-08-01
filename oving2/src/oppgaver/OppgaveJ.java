package oppgaver;


import java.util.Scanner;

/*
 * Oppgave h)
 */
public class OppgaveJ {
	
	public static double resonansfrekvens(double resistans, double induktans, double kapasitans) {
		return 1.0/(2.0 * Math.PI * Math.sqrt(induktans*kapasitans));
	}

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.print("Resistans: ");
		double resistans = inn.nextDouble();
		System.out.print("Induktans: ");
		double induktans = inn.nextDouble();
		System.out.print("Kapasitans: ");
		double kapasitans = inn.nextDouble();
		double frekvens = resonansfrekvens(resistans, induktans, kapasitans);
		System.out.println("Resonansfrekvensen er: " + frekvens);
	}

}
