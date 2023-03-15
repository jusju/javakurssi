package viikko6metoditjalistat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakarikorvaus {
	
	public double laskeKorvaus(int kesto) {		
		if(kesto <= 10) {
			return 8;
		} else if(kesto <= 20) {
			return 11;
		} else {
			return 13.5;
		}	
	}
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		Laakarikorvaus olio = new Laakarikorvaus();
				
		System.out.print("Anna käynnin kesto: ");
		int kesto = lukija.nextInt();
		// METODIN KUTSU ILMAN STATIC SANAA
		double korvaus = olio.laskeKorvaus(kesto);
		System.out.print("Kestoltaan " + kesto);
		System.out.print(" minuutin yleislääkärikäynnistä kelakorvaus on ");
		DecimalFormat formaatteri = new DecimalFormat("0.00");
		System.out.print(formaatteri.format(korvaus));
		System.out.println(" euroa");
	}
}
