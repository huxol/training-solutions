package gyakorlás.hilfe;

public class AlapAlgoritmusok {

    /*
      Megszámlálás
         Hány 180 cm-nél magasabb diák jár az osztályba?

        int szamlalo = 0;
        for( int i = 0; i < tomb.length; i++ ) {
          if( tomb[i] > 180 )
          {
            szamlalo = szamlalo + 1;    vagy szamlalo++;
          }
        }

        System.out.println("Az osztalyba "+szamlalo+" db 180 cm-nel "
                           "magasabb diak jar.");
------------

      Összegzés:
        Mennyi a tömbben található páros számok összege?

        int osszeg = 0;
        for( int i = 0; i < tomb.length; i++ ) {
          if( tomb[i] % 2 == 0 ) {
            osszeg = osszeg + tomb[i];  vagy osszeg += tomb[i];
          }
        }

        System.out.println("A tombben levo paros szamok osszege: "+osszeg);
      -------

        Mennyi a páratlan számok átlaga?

        int osszeg = 0;
        int db = 0;

        for( int i = 0; i < tomb.length; i++ ) {
          if ( tomb[i] % 2 != 0 ) {
            osszeg = osszeg + tomb[i];
            db++;
          }
        }
        double atlag = (double)osszeg/db;
        System.out.println("A tomb paratlan szamainak atlaga: "+atlag );

------------

    Eldöntés tétele
        Van-e 30 évnél fiatalabb tanár az iskolában?
        (itt a relációk ellentettjét kell használni!)

        int i = 0;
        while( i < tomb.length && tomb[i] >= 30 ) {
          i++;
        } if ( i < tomb.length ) {
          System.out.println("Van az iskolaban 30 evnel fiatalabb tanar.");
        }

-----------

    Kiválasztás tétele
        Válasszuk ki a tömbből az 50-es számot (nem index, hanem érték!).

        int i = 0;
        while( tomb[i] != 50 ) {
          i++;
        }

        System.out.println("Az 50-es szám indexe: "+i);

-------------

    Keresés
        van-e 190 cm-nél magasabb diák és hogy ő hányadik a tömbben:

        int i = 0;
        while ( i < tomb.length && tomb[i] <= 190 ) {
          i++;
             } if ( i < tomb.length ) {
                 System.out.println("A 190 cm-nél magasabb diák helye: "+i);
                 } else {
             System.out.println("Nincs ilyen diák.");
                }
        }
-------------

    Minimum/maximum keresés

        int max = 0;
        for( int i = 1; i < tomb.length; i++ ) {
           if( tomb[i] > tomb[max] ) max = i;
         }
         System.out.println("A tombben levo legnagyobb szam: "+tomb[max]);

------------



    */
}
