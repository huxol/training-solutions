package exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = reader.readLine())  != null) {
            result.append("*".repeat(Integer.parseInt(line)));
            result.append("\n");
        }
        return result.toString();
    }

   /* public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/histogram.txt"))) {
            new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    } */
}
