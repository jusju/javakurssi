package viikko9tiedostot;

import java.util.Scanner;

public class LainaOhjelma {
	
	public double laskeLainanKustannukset(double lainasumma, double tasaeranMaara) {
		double KORKO = 0.0786;
		double jaljellaOlevaLainapaaoma = lainasumma;
		int kuukaudet = 1;
		double kertyneetLyhennykset = 0;
		lainasumma = lainasumma * KORKO + lainasumma;
		double kuukaudenKorko = lainasumma * KORKO;
		while(lainasumma > 0) {
			kertyneetLyhennykset = kertyneetLyhennykset + (tasaeranMaara - kuukaudenKorko );
			jaljellaOlevaLainapaaoma = jaljellaOlevaLainapaaoma - (tasaeranMaara - kuukaudenKorko );
			kuukaudenKorko = (KORKO * jaljellaOlevaLainapaaoma) / 12.0 ; 
			kuukaudet++;
			if(kuukaudet%12 == 0) {
				jaljellaOlevaLainapaaoma = jaljellaOlevaLainapaaoma - kertyneetLyhennykset;
				kuukaudet = 0;
				kertyneetLyhennykset = 0;
			}
		}
		return kuukaudet;
	}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna tarvittava lainam‰‰r‰: ");
		double lainamaara = lukija.nextDouble();
		System.out.print("Anna yhden maksuer‰n suuruus: ");
		double maksuera = lukija.nextDouble();
		LainaOhjelma lainaohjelma = new LainaOhjelma();
		double lainanKustannukset = lainaohjelma.laskeLainanKustannukset(lainamaara, maksuera);
		System.out.println("Pankin kustannukset ovat v‰hint‰‰n: " + lainanKustannukset);
	}

}
