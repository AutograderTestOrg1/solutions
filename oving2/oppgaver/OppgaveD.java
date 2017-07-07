package oppgaver;

public class OppgaveD {

	public static double sumGeometriskRekkeForLoop(double a0, double r, double n) {
		double sum = a0;
		double nverdi = a0;
		for (int i=1;i<=n;i++) {
			nverdi *= r;
			sum += nverdi;
		}
		return sum;
	}
	
	// Main metode, del av oppgave g)
	public static void main(String[] args) {
		System.out.println(sumGeometriskRekkeForLoop(1, 0.5, 20));
	}

}
