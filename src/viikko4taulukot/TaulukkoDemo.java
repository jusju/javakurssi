package viikko4taulukot;

public class TaulukkoDemo {

	public static void main(String[] args) {
		
		// LUODAAN INT TYYPPISI� MUUTTUJIA SIS�LT�V�
		// TAULUKKO 
		int[] arvosanat = new int[55];
		// TESTATAAN TAULUKKOON ARVON SIJOITUSTA
		arvosanat[0] = 5;
		arvosanat[1] = 4;
		arvosanat[2] = 1;
		// TULOSTETAAN TAULUKON SIS�LT�
		for (int i = 0; i < arvosanat.length; i++) {
			// TULOSTETAAN TAULUKKO N�YT�LLE
			System.out.println(arvosanat[i]);
		}
	}

}
