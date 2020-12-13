package week02d05;

import java.util.Arrays;
import java.util.List;

public class Languages {

    private String programName;
    private List<String> programNames;

    public static void main(String[] args) {
        Languages languages = new Languages();
        List<String> programNames = Arrays.asList("Java", "Python", "JavaScript");
        for (String name: programNames) {
            if (name.length() > 5) {
                System.out.println(name);
            }
        }
    }
}

//* Hozz létre egy Languages osztályt, main metódussal!
// Ebben hozz létre egy listát, mely karakterláncokat tartalmaz!
// Vegyetek fel 3 elemet: Java, Python, JavaScript!
//
//Írd ki, az öt karakternél hosszabb programozási nyelveket!
