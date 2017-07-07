package oppgaver;
import java.util.Scanner;

public class OppgaveBogC {
	
	public static double fallengde(double tid) {
		double resultat;
		resultat = 0.5*9.81*tid*tid;
		return resultat;
	}

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.print("Tid i sekunder: ");
		double sekunder = inn.nextDouble();			// Det er OK å bruke int også her
		if (sekunder > 0) {
			double avstand = fallengde(sekunder);
			System.out.println("På " + sekunder + " sekunder har objektet falt " + avstand);
		} else {
			System.out.println("Antall sekunder må være større enn 0!");
		}
	}

}
