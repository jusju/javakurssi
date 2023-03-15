package viikko9tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TiedostoKirjoitusDemo {

	public static void main(String[] args) {
		Path tiedostopolku = Paths.get("kirjoitustesti.txt");
		try {
			List<String> rivit = Arrays.asList("rivi1", "rivi2");
			Files.write(tiedostopolku, rivit, StandardCharsets.UTF_8);
			System.out.println("Tiedostoon kirjoitus onnistui.");
			
			
		} catch(IOException ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
	}

}
