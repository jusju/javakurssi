package viikko8poikkeukset;

import java.util.Scanner;

public class KysyUudestaan {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Sy�t� kokonaisluku: ");
		int luku = 0;
		while (true) {
			try {
				luku = lukija.nextInt();
				break;
			} catch (Exception poikkeus) {
				lukija.nextLine();
				System.out.println("Virheellinen luku!");
				System.out.println("Sy�t� kokonaisluku: ");
			}
		}

		System.out.println("Sy�tit luvun " + luku + ".");

	}

}
