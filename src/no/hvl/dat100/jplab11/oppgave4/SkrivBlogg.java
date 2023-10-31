package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {

			File fil = new File(mappe + filnavn);
			FileWriter skriver = new FileWriter(fil);

			String Skrift = samling.toString();

			skriver.write(Skrift);

			skriver.close();
			return true;
		}

		catch (IOException e) {

			System.out.println("FEIL");
			e.printStackTrace();
			return false;
		}

	}
}
