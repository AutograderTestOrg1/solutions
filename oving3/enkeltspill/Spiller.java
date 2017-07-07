package enkeltspill;

// Start oppgave b)
public class Spiller {
	private int id;
	private String navn;
	private int poengsum;	
	// Slutt oppgave b)
	
	// Oppgave c)
	public Spiller(int id, String navn) {
		this.id = id;
		this.navn = navn;
		poengsum = 0;
	}

	/*
	 * Start oppgave d). 
	 * 
	 * Merk: Det er ikke n�dvendig at studentene bruker exception handling for � f� godkjent, det er nok
	 * at de skriver ut en feilmelding til konsollet.
	 */
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		if (navn.equals("")) throw new IllegalArgumentException("Spilleren m� ha et reelt navn!");
		this.navn = navn;
	}

	public int getPoengsum() {
		return poengsum;
	}

	public void setPoengsum(int poengsum) {
		if (poengsum < 0) throw new IllegalArgumentException("Poengsum kan ikke v�re negativ!");
		this.poengsum = poengsum;
	}

	public int getId() {
		return id;
	}
	// Slutt oppgave d)
	
	// Oppgave e)
	public void skrivUtSpiller() {
		System.out.println("Spiller " + id + ": " + navn + ", har " + poengsum + " poeng");
	}
	
	// Oppgave g)
	public static Spiller hoyestPoengsum(Spiller s1, Spiller s2) {
		if (s1.getPoengsum() >= s2.getPoengsum()) return s1;
		return s2;
	}
}
