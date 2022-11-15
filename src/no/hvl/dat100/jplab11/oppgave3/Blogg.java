package no.hvl.dat100.jplab11.oppgave3;



import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;


public class Blogg {

	// TODO: objektvariable 
	Innlegg [] innleggtabell;
	int nesteledige = 0;

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int x = 0; x < innleggtabell.length; x++) {
			if (innleggtabell[x] != null && innleggtabell[x].erLik(innlegg)) {
				return x;
			}
		} 
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == innlegg)
				finnes = true;
		}
		return finnes;
	}

	public boolean ledigPlass() {
		if(nesteledige < innleggtabell.length) {
			return true;
		}
			return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass() && !finnes(innlegg)) {
		innleggtabell[nesteledige] = innlegg;
		nesteledige++;
		return true;
		}
		return false;
	}
	
	public String toString() {
		String str =  nesteledige + "\n";
		
		for (Innlegg s: innleggtabell) {
			if (s != null)
			str += s.toString();
		}
		return str;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}