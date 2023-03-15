package viikko4taulukot;

public class TaulukkoDemo {

	public static void main(String[] args) {
		
		// LUODAAN INT TYYPPISIÄ MUUTTUJIA SISÄLTÄVÄ
		// TAULUKKO 
		int[] arvosanat = new int[55];
		// TESTATAAN TAULUKKOON ARVON SIJOITUSTA
		arvosanat[0] = 5;
		arvosanat[1] = 4;
		arvosanat[2] = 1;
		// TULOSTETAAN TAULUKON SISÄLTÖ
		for (int i = 0; i < arvosanat.length; i++) {
			// TULOSTETAAN TAULUKKO NÄYTÖLLE
			System.out.println(arvosanat[i]);
		}
	}

}
