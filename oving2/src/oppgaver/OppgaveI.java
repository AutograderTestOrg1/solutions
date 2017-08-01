package oppgaver;

public class OppgaveI {
	public static boolean erSkuddAAr(int aar) {
		if (aar % 400 == 0) return true;
		if (aar % 100 == 0) return false;
		if (aar % 4 == 0) return true;
		return false;
	}
}
