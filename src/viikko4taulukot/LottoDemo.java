package viikko4taulukot;

import java.util.Arrays;
import java.util.Scanner;

public class LottoDemo {

	public static void main(String[] args) {
		int[] numerot;
		int numero, lkm;
		Scanner input = new Scanner(System.in);
		System.out.print("Montako numeroa annat (7-10): ");
		lkm = input.nextInt();
		numerot = new int[lkm];
		for (int i = 0; i < numerot.length; i++) {
			System.out.print("Anna " + (i + 1) + " lottonumerosi: ");
			// NUMEROITA LUETTAESSA SY�TT�PUSKURIIN J��
			// TURHA ENTER PY�RIM��N
			numero = input.nextInt();
			numerot[i] = numero;
		}
		Arrays.sort(numerot);
		System.out.print("Rivisi oli ");
		for (int i = 0; i < numerot.length; i++) {
			System.out.print(numerot[i] + " ");
		}
		// SY�TT�PUSKURIN TYHJENT�MINEN ENTEREIST�
		// JOTKA SINNE J��V�T AINA NUMEROITA LUETTAESSA
		input.nextLine();
		
		System.out.println("Anna nimesi: ");
		String nimi = input.nextLine();
		System.out.println("Onneksi olkoon: "  + nimi);

	}
}
