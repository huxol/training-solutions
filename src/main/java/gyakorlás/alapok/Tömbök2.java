package gyakorlás.alapok;

public class Tömbök2 {

    // Tölts fel egy 3×5-ös kétdimenziós tömböt a [-10;30] intervallumból:
    // Írd ki a tömböt sorokba és oszlopokba rendezve:

    public static void main(String[] args) {
        int [][] tömb = new int [3][5];

        for(int i = 0; i < tömb.length; i++) {
            for( int j = 0; j < tömb[i].length; j++ ) {
                tömb[i][j] = (int)(Math.random()*41)-10;
                System.out.print( tömb[i][j] + " " );
            }
            System.out.println();
        }
    }

    /* Írd ki a tömbben szereplő számok összegét:

        int osszeg = 0;
        for( int i = 0; i < tömb.length; i++ ) {
            for( int j = 0; j < tömb[i].length; j++ ) {
                osszeg = osszeg + tomb[i][j];   -  vagy osszeg += tomb[i][j];
            }
        }
            System.out.println("A tomb elemeinek osszege"+osszeg);

     */
}
