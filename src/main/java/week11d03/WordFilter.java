package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> result = new ArrayList<>();
        for(String s : words) {
            if(s.indexOf(c)>=0) {
                result.add(s);
            }
        }
        return result;
    }
}


//* 2021-01-13 week11d03
//
//Készíts egy WordFilter osztályt, melyben van egy List<String>
// wordsWithChar(List<String> words, char c) metódus.
// A metódus kiválógatja a paraméterül kapott String listából
// azokat a szavakat, melyekben előfordul a c karakter,
// majd ezeket visszaadja egy listában. */
