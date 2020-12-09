package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> testList) {

        for (int i = 1; i < testList.size(); i++) {
            if (testList.get(i-1)>testList.get(i)) {
                return false;
            }
        }
        return true;
    }
}


//* A week07d03 csomagban hozz létre egy NumberList osztályt.
// Ennek legyen egy metódusa isIncreasing(List<Integer>) mely
// egy számokból álló listát vár paraméterül és megnézi, hogy a listában
// a számok növekvő sorrendben szerepelnek-e és ennek megfelelően
// igaz vagy hamis értékkel tér vissza. Speciális eset ha két egymást követő szám egyenlő,
// ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük.
