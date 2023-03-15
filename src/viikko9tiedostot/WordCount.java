package viikko9tiedostot;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        try {
            System.out.print("Anna tiedoston nimi: ");
            String tiedosto = lukija.nextLine();
            List<String> rivit = Files.readAllLines(Paths.get(tiedosto), Charset.forName("UTF-8"));
            int merkit = 0, sanat = 0;

            for (String rivi : rivit) {
                merkit += rivi.length();
                for (String sana : rivi.split("\\s+")) {
                    if (!sana.isEmpty()) {
                        sanat++;
                    }
                }
            }
            System.out.println();
            System.out.println("Tiedostossa on:");
            System.out.println("" + rivit.size() + " riviä");
            System.out.println("" + sanat + " sanaa");
            System.out.println("" + merkit + " merkkiä");

        } catch (IOException e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        lukija.close();
    }
}