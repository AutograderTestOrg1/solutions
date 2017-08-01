package oving1;

import java.util.Scanner;

/*
 * Oppgave h)
 */
public class Diamant {
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.print("Størrelse: ");
		int storrelse = inn.nextInt();
		
		for (int y = 0;y< storrelse; y++) {
			skrivUtDiamantLinje(storrelse, y);
		}
		for (int y = storrelse-2;y>=0;y--) {
			skrivUtDiamantLinje(storrelse, y);
		}
	}

	
	// Skiller ut dette som en metode siden det skal gjøres såpass mange ganger.
	private static void skrivUtDiamantLinje(int storrelse, int y) {
		for (int x=0;x<(2*storrelse);x++) {
			if (x == (storrelse-1)-y) {
				System.out.print("*");
			} else if (x == (storrelse-1)+y) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
