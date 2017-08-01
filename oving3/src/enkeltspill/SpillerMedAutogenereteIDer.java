package enkeltspill;

// Oppgave i)
public class SpillerMedAutogenereteIDer {
	private int id;
	private String navn;
	private int poengsum;
	
	private static int nesteID = 1;
	
	public SpillerMedAutogenereteIDer(String navn) {
		this.id = nesteID;
		nesteID++;
		this.navn = navn;
		poengsum = 0;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		if (navn.equals("")) throw new IllegalArgumentException("Spilleren må ha et reelt navn!");
		this.navn = navn;
	}

	public int getPoengsum() {
		return poengsum;
	}

	public void setPoengsum(int poengsum) {
		if (poengsum < 0) throw new IllegalArgumentException("Poengsum kan ikke være negativ!");
		this.poengsum = poengsum;
	}

	public int getId() {
		return id;
	}
	
	public void skrivUtSpiller() {
		System.out.println("Spiller " + id + ": " + navn + ", har " + poengsum + " poeng");
	}
	
	public static SpillerMedAutogenereteIDer hoyestPoengsum(SpillerMedAutogenereteIDer s1, SpillerMedAutogenereteIDer s2) {
		if (s1.getPoengsum() >= s2.getPoengsum()) return s1;
		return s2;
	}
}
