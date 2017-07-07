package oppgaver;
import java.util.Scanner;

public class OppgaveA {
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		double side1;
		double side2;
		double vinkel;
		double resultat;

		System.out.print("Side A: ");
		side1 = inn.nextDouble();
		System.out.print("Side B: ");
		side2 = inn.nextDouble();
		System.out.print("Vinkel i grader mellom de to: ");
		vinkel = inn.nextDouble();
		
		vinkel = Math.toRadians(vinkel);
		
		resultat = 0.5*side1*side2*Math.sin(vinkel);
		
		System.out.println("Areal av trekanten: " + resultat);
	}
}
