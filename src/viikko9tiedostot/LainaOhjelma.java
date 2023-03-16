
import java.util.Scanner;

public class LainaOhjelma {

	public int laskeLainanTakaisinmaksuKuukaudet(double lainasumma, double tasaeranMaara) {
		final double KORKO = 0.0786;
		double jaljellaOlevaLainapaaoma = lainasumma;
		int kuukaudet = 1;
		double kertyneetMaksut = 0;
		double kuukaudenKorko = (jaljellaOlevaLainapaaoma * KORKO) / 12;
		double kertyneetKorot = 0;
		while (jaljellaOlevaLainapaaoma > 0) {
			if((tasaeranMaara-kuukaudenKorko) > jaljellaOlevaLainapaaoma) {
				kertyneetMaksut = kertyneetMaksut + (tasaeranMaara - kuukaudenKorko);
			} else {
				kertyneetMaksut = kertyneetMaksut + jaljellaOlevaLainapaaoma + kuukaudenKorko;
			}
			kertyneetMaksut = kertyneetMaksut + (tasaeranMaara - kuukaudenKorko);
			kertyneetKorot = kertyneetKorot + kuukaudenKorko;
			jaljellaOlevaLainapaaoma = jaljellaOlevaLainapaaoma - (tasaeranMaara - kuukaudenKorko);

			kuukaudenKorko = (KORKO * jaljellaOlevaLainapaaoma) / 12.0;

			kuukaudet++;
		}
		return kuukaudet;
	}

	public double laskeLainanKustannukset(double lainamaara, double tasaeranMaara) {
		final double KORKO = 0.0786;
		double jaljellaOlevaLainapaaoma = lainamaara;
		int kuukaudet = 1;
		double kertyneetMaksut = 0;
		double kuukaudenKorko = (jaljellaOlevaLainapaaoma * KORKO) / 12;
		double kertyneetKorot = 0;
		while (jaljellaOlevaLainapaaoma > 0) {
			kertyneetMaksut = kertyneetMaksut + (tasaeranMaara - kuukaudenKorko);
			kertyneetKorot = kertyneetKorot + kuukaudenKorko;
			jaljellaOlevaLainapaaoma = jaljellaOlevaLainapaaoma - (tasaeranMaara - kuukaudenKorko);

			if (kuukaudet % 12 == 0) {

				kuukaudenKorko = (KORKO * jaljellaOlevaLainapaaoma) / 12.0;
			}
			kuukaudet++;
		}
		return kertyneetKorot;

	}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna tarvittava lainamaara: ");
		double lainamaara = lukija.nextDouble();
		System.out.print("Anna yhden maksueran suuruus: ");
		double maksuera = lukija.nextDouble();
		LainaOhjelma lainaohjelma = new LainaOhjelma();
		int kuukaudet = lainaohjelma.laskeLainanTakaisinmaksuKuukaudet(lainamaara, maksuera);
		System.out.println("Kuukausia menee: " + kuukaudet);
		double lainanKustannukset = lainaohjelma.laskeLainanKustannukset(lainamaara, maksuera);
		System.out.println("Rahan hinta on: " + lainanKustannukset);
		System.out.println("Kuukausia menee: " + kuukaudet);
	}

}
