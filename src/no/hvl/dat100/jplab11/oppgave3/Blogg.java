package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		nesteledig = 0;
		 innleggtabell = new Innlegg[20];

	}

	public Blogg(int lengde) {
		nesteledig = 0;
		 innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}

		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].getId() == innlegg.getId()) {
				finnes = true;
			}
		}
		return finnes;

	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) {
			return true;
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass() && !finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else
			return false;
	}

	public String toString() {
		String melding = (nesteledig + "\n");
		for (int i = 0; i<nesteledig;i++) {
			 melding += innleggtabell[i].toString();
		}
		return melding;
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