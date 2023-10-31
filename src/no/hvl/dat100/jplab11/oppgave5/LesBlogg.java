package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn){

		try {
		File fil = new File(mappe + filnavn);
			BufferedReader leser = new BufferedReader(new FileReader(fil));
			String line = leser.readLine();
			Blogg blogg = new Blogg(Integer.parseInt(line));
			if (leser.readLine().contains("TEKST")) {
				
				
			}
					
			
		} catch (FileNotFoundException e) {
			System.out.println("feil");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Feil 2");
			e.printStackTrace();
		}
			
		

	}
}
