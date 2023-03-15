package viikko8poikkeukset;

import java.util.Scanner;

public class PoikkeusDemo {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna ikäsi: ");
		// ESITELLÄÄN TARVITTAVA MUUTTUJA JO TÄSSÄ SCOPE-SÄÄNTÖJEN MUKAAN
		// ELI SUOMEKSI NÄKYVYYSSÄÄNNÖT
		int ika = 0;
		// ALOITETAAN TRY-LOHKO, JONKA SISÄLLÄ VOI SATTUA POIKKEUS ELI ERRORI

		try {
			ika = lukija.nextInt();

		} catch (Exception poikkeus) {

			System.out.println("Antamasi ikä ei kelpaa.");

		} finally {
			System.out.println("POIKKEUS TAPAHTUI");
		}
		
		System.out.println("Muistan nyt ikäsi: " + ika);

	}
}
