package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getPositionOfChar(String s, char c) {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(0) == s.toLowerCase().charAt(i)) {
                index.add(i);
            }
        }
        return index;
    }
}


//* A Search osztályban írj egy getIndexesOfChar() metódust,
// mely első paraméterként vár egy String értéket, második paraméterként egy
// char értéket! Visszaad egy listát, melyben visszaadja, hogy a karakter
// hanyadik indexeken szerepel az első paraméterként átadott listában.
//
//Pl.: almafa szóban a a karakter: 0, 3, 5.
