package viikko4taulukot;

import java.util.Scanner;

public class Salasana {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna salasana:");
		String salasana = lukija.nextLine();
		boolean onTarpeeksiPitka = false;
		if (salasana.length() >= 8) {
			onTarpeeksiPitka = true;
		}
		boolean yksiTaiUseampiSuurella = false;

		for (int i = 0; i < salasana.length(); i++) {
			String merkki = salasana.substring(i, i + 1);
			if (i != salasana.length()) {
				if (Character.isUpperCase(merkki.charAt(0))) {
					yksiTaiUseampiSuurella = true;
					break;
				}
			}
		}
		boolean yksiTaiUseampiPienella = false;
		for (int i = 0; i < salasana.length(); i++) {
			String merkki = salasana.substring(i, i + 1);
			if (Character.isLowerCase(merkki.charAt(0))) {
				yksiTaiUseampiPienella = true;
				break;
			}
		}
		boolean yksiTaiUseampiNumeroa = false;
		for (int i = 0; i < salasana.length(); i++) {
			String merkki = salasana.substring(i, i + 1);
			if (Character.isDigit(merkki.charAt(0))) {
				yksiTaiUseampiNumeroa = true;
				break;
			}
		}
		
		if (yksiTaiUseampiPienella && yksiTaiUseampiSuurella
				&& yksiTaiUseampiNumeroa && onTarpeeksiPitka) {
			System.out.println("Salasana kelpaa.");
		} else {
			System.out.println("Salasana ei käy.");
		}
	}

}
