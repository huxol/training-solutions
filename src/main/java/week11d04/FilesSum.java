package week11d04;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int readFile(String name) {
        try {
            String fileContent = Files.readString(Path.of(name));
            int number = Integer.parseInt(fileContent);
            return number;
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file", e);
        }
    }

    public int sumNumbers() {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            String filename = String.format("number%02d.txt", i);
            System.out.println(filename);

            if (Files.isRegularFile(Path.of(filename))) {
                System.out.println("found");
                int number = readFile(filename);
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new FilesSum().readFile("number20.txt"));
    }

}

//* 2021-01-14 week11d04
//
//Adott az aktuális könyvtárban több, fájl, melynek a nevei:
// number00.txt, number03.txt, number20.txt, egészen 99-ig.
//Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó
// fájl kimaradt. Olvasd be az állományból a benne lévő számot, és ezt összegezd!
// Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
//Használd a Files.readString() metódust a fájl beolvasására!
// A FilesSum osztály sumNumbers(InputStream) metódusába dolgozz! */
