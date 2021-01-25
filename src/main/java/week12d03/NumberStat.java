package week12d03;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    public int findSmallestUnique() {
        if(numbers.size() == 0) {
            throw new IllegalStateException("Attribute is empty!");
        }
        if(numbers.size() == 1) {
            return numbers.get(0);
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        if(numbers.get(0) !=numbers.get(1)) {
            return numbers.get(0);
        }
        
        for(int i = 1; i < sortedNumbers.size()-1; i++) {
            if(sortedNumbers.get(i) !=sortedNumbers.get(i-1) && sortedNumbers.get(i) != sortedNumbers.get(i+1)) {
                return sortedNumbers.get(i);
            }
        }

        if(numbers.get(numbers.size()-1) != numbers.get(numbers.size()-2)) {
            return sortedNumbers.get(numbers.size()-1);
        }

        throw new IllegalStateException(" No unique number!");
    }

    public void readFromFile(String fileName) {
        Path file = Path.of(fileName);

        try(BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while((line = br.readLine()) != null);
        } catch (IIOException e) {
            throw new IllegalArgumentException("Something went wrong!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }
}
