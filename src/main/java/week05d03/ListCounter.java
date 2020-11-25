package week05d03;

import java.util.List;

public class ListCounter {

    public int Start(List<String> words) {
        int counter = 0;

        for(String s : words) {
            if(s.toUpperCase().startsWith("A")) {
                counter++;
            }
        }
        return counter;
    }
}

//* Írj egy olyan metódust az week05d03.ListCounter osztályban, mely egy kapott Listából (String)
// összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
//Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza.*/