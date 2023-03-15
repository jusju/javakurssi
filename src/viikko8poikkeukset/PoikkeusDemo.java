package viikko8poikkeukset;

import java.util.Scanner;

public class PoikkeusDemo {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna ik�si: ");
		// ESITELL��N TARVITTAVA MUUTTUJA JO T�SS� SCOPE-S��NT�JEN MUKAAN
		// ELI SUOMEKSI N�KYVYYSS��NN�T
		int ika = 0;
		// ALOITETAAN TRY-LOHKO, JONKA SIS�LL� VOI SATTUA POIKKEUS ELI ERRORI

		try {
			ika = lukija.nextInt();

		} catch (Exception poikkeus) {

			System.out.println("Antamasi ik� ei kelpaa.");

		} finally {
			System.out.println("POIKKEUS TAPAHTUI");
		}
		
		System.out.println("Muistan nyt ik�si: " + ika);

	}
}
