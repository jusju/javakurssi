package viikko9tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TiedostoEsimerkki {

	public static void main(String[] args) {
		Path tiedostopolku = Paths.get("chatgpt.txt");
		
		try {
			List<String> rivit = Files.readAllLines(tiedostopolku);
			for (int i = 0; i < rivit.size(); i++) {
				System.out.println(rivit.get(i));
			}
			
		} catch(IOException ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
		
	}
}
