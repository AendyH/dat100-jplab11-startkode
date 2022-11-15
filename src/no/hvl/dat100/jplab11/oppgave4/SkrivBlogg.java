package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		boolean skrevet = false;

		try {
			PrintWriter pw = new PrintWriter(mappe+filnavn);
			pw.print(samling.toString());
			System.out.println("Write successful.");
			pw.close();
			skrevet = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Write failed.");
			skrevet = false;
		}
			
		return skrevet;
	}
}
