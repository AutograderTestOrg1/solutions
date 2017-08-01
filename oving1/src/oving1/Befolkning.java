package oving1;

public class Befolkning {

	public static void main(String[] args) {
		double befolkningIMilliarder = 7.29; // Her er det OK å bruke andre tall siden befolkningen hele tida endrer seg
		double eksponent = 1.0 + 0.0114; // 1.0 for nåværende befolkning + 1,14/100 for 1,14%
		for (int aar = 2015;aar < 2025;aar++) {
			befolkningIMilliarder *= eksponent;
			System.out.printf("Befolkninga i %d er: %6.2f %n", aar, befolkningIMilliarder);
		}
	}

}
