package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double>hights) {
        double sum = 0;
        for( int i = 1; i < hights.size(); i ++) {
            if ( hights.get(i) > hights.get(i-1) ) {
                sum += hights.get(i)-hights.get(i-1);
            }
        }
        return sum;
    }
}

//* 2020-01-04
//
//Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat,
// valamint a magasságot (mindegyik lebegőpontos érték).
//Írj a week10d01.Hiking osztályba egy getPlusElevation() metódust, mely megkapja
// a magasságok listáját, és visszaadja
//a emelkedések összegét. Azaz pl. 10,20,15,18 esetén 13, ugyanis (20 - 10) + (18 - 15).
// A 20 méterről 15 méterre ereszkedést nem számolja bele,
//hiszen az ereszkedés, és nem emelkedés. */
