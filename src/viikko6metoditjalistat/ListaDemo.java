package viikko6metoditjalistat;

import java.util.ArrayList;
import java.util.List;

public class ListaDemo {
	public static void main(String[] args) {
		// LISTAN LUONTI TAPA 1
		ArrayList<String> nimet1 = new ArrayList<String>();
		
		nimet1.add("Olivia");
		nimet1.add("Aaron");
		nimet1.add("Eino");
		
		// ESIMERKKI REMOVEN KÄYTÖSTÄ
		nimet1.remove(1);
		
		// LISTAN LÄPIKÄYNTI
		// SIZE KOMENTO PALAUTTAA LISTAN KOON
		for (int i = 0; i < nimet1.size(); i++) {
			// GET-KOMENTO PALAUTTAA SOLUN SISALLON TIETYSSA INDEKSISSA
			System.out.println(nimet1.get(i));
		}
	}
}
