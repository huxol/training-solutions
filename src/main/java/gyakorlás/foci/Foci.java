package gyakorlás.foci;

import java.io.*;
import java.util.*;

public class Foci {
    //*  Olvassuk be a meccs.txt fájlban található adatokat! Tárolásukra
    // két tömböt fogunk használni, mivel az adatok egy része egész számokat,
    // másik része szöveget tartalmaz. Alkalmazzuk a "tömb a tömbben" módszert,
    // mivel adategységenként (az inputfájl egy-egy sora) 5 szám- és 2 szövegadat
    // tárolásáról kell gondoskodnunk. A tömböket statikus osztályváltozókként
    // definiáljuk, mivel a későbbiekben egy saját metódussal - MaxMin()- fogunk
    // hivatkozni rájuk.

    public static int [][] T1;
    public static String [][] T2;

    public static int MaxMin(int z) {
        return Math.max(T1[z][1], T1[z][2]) * 10 + Math.min(T1[z][1], T1[z][2]);
    }

    //*  A megoldás a mérkőzések számának beolvasásával kezdődik, majd soronként
    // feldolgozzuk az inputfájlt. Ez a StringTokenizer osztály metódusainak segítségével
    // (a sort a szóközök mentén feldarabolva) könnyen megvalósítható.

    public static void main(String[] args) throws IOException {

        int i = 0;
        int msz = 0;

        BufferedReader br = new BufferedReader(new FileReader("meccs.txt"));
        msz = Integer.parseInt(br.readLine());
        T1 = new int[msz][6];
        T2 = new String[msz][2];
        String sor;
        while ((sor = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(sor, " ");
            for (int j = 0; j < 5; j++) {
                T1[i][j] = Integer.parseInt(st.nextToken());
            }
            T1[i][5] = 0;
            T2[i][0] = st.nextToken();
            T2[i][1] = st.nextToken();
            i++;
        }
        br.close();


        //* 2. feladat: Egy forduló sorszámát bekérve írjuk ki a képernyőre az
        // adott forduló mérkőzéseinek adatait a megadott formában.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Kérem a forduló számát! ");
        int fsz = scanner.nextInt();
        for (int j = 0; j < msz; j++)
            if (T1[j][0] == fsz)
                System.out.println(T2[j][0] + " - " + T2[j][1] + " : " + T1[j][1] + " - " + T1[j][2]
                        + " ( " + T1[j][3] + " - " + T1[j][4] + " ) " );
        System.out.println(" ");
    }
}
