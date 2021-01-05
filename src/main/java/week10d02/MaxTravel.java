package week10d02;

import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> numbers) {
        int[] counters = count(numbers);

        int index = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[index] < counters[i]) {
                index = i;
            }
        }
        return index;
    }

    private int[] count(List<Integer> numbers) {
        int[] counters = new int[30];
        for (int i : numbers) {
            counters[i]++;
        }
        return counters;
    }

    public static void main(String[] args) {
        int max = new MaxTravel().getMaxIndex(List.of(3, 3, 12, 12, 0, 3, 4, 3, 3, 4, 12, 3));
        System.out.println(max);
    }
}

/*
* 2021-01-05 week10d02
Van egy egész számok listája, amelyben egy szám azt jelzi,
 hogy az adott számú buszmegállóban egy ember fel akar szállni.
 A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es
 buszmegállóban 2-en, a 0-ásban 1 ember, 3-asban egy ember,
 4-esben 2 ember akar felszállni. A MaxTravel osztály
 getMaxIndex() metódusa adja vissza, hogy hanyas megállóban
 szeretnének a legtöbben felszállni. Maximum 30 megálló lehet.

12,12,0,34,4,12

int[30]

0 -0-ásból mennyi van,
1 1-esből mennyi van.
...
*/
