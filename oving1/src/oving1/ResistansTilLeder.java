package oving1;

import java.util.Scanner;

public class ResistansTilLeder {

	public static void main(String[] args) {
		double lengde;
		double diameter;
		double resistivitet = 0.0;
		double resistans;
		int materiale;
		
		Scanner inn = new Scanner(System.in);		
		System.out.print("Lengden til lederen i meter: ");
		lengde = inn.nextDouble();
		System.out.print("Diameter til lederen i meter: ");
		diameter = inn.nextDouble();
		System.out.print("Materialet lederen er laget av. Skriv 1 for kobber og 2 for aluminium: ");
		materiale = inn.nextInt();
		if (materiale == 1) {
			resistivitet = 1.68E-8;
		}
		if (materiale == 2) {
			resistivitet = 2.82E-8;
		}
		if (resistivitet == 0.0) {
			System.out.println("Du har oppgitt en ukjent materialkode");
			System.exit(0);
		} else {
			System.out.println("Resistivitet: " + resistivitet);
		}
		resistans = resistivitet*(lengde / (Math.PI*Math.pow(diameter/2.0, 2.0)));
		System.out.println("Resistansen er: " + resistans);
	}

}
