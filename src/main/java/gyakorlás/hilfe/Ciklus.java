package gyakorlás.hilfe;

public class Ciklus {

    /* Main.java - Számláló for

    public class Main {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    } */

    /* Main.java Iteráló for - tömb elemeinek bejárása

    public class Main {
        public static void main(String[] args) {
            int[] array = {3, 5, 7, 4};
            for (int element : array) {
                System.out.println(element);
            }
        }
    } */

    /* Main.java - while - feltétel vizsgálat (elöl tesztel)

    public class Main {
        public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        }
    }
    -----
    sorsoljunk ki 10 páratlan számot egy adott intervallumból [1;100]

    int db = 0;
    int szam;
    while( db != 10 )
    {
      szam = (int)(Math.random() * 100) + 1;
      if( szam % 2 != 0 )
      {
        System.out.println(szam);
        db++;
      }
    }

    -------

    Hátul tesztelő ciklus – do-while

    Sorsolj ki egy páros számot a [10;50] intervallumból, ami 2-vel és 5-tel is osztható:

    int szam;
    do
    {
      szam = (int)(Math.random() * 41) + 10;
    }
    while( !(szam % 2 == 0 && szam % 5 == 0) );

    -----

    Ha tudom hányszor fusson a ciklus, akkor for ciklus.
    Ha nem tudom hányszor fusson a ciklus ÉS lehet, hogy egyszer sem kell, akkor while ciklus.
    Ha nem tudom hányszor fusson a ciklus ÉS egyszer mindenképpen kell, akkor do-while ciklus.
*/
}
