package gyakorlás.alapok;

public class TőmbVéletlenSzám {

    /* Készíts programot, amely feltölt 1-től 10-ig véletlen valós számokkal
    egy 6x6-os tömböt, majd megjeleníti a tömb tartalmát!
    Írja ki a program a számok átlagát is! */


    public static void main(String[] args) {
        int összeg = 0;
        int[][] számok = new int[6][6];
        for (int i = 0; i <= 5; i++)
            for (int j = 0; j <= 5; j++) {
                számok[i][j] = (int) (Math.random() * 9) + 1;
                összeg = összeg + számok[i][j];
            }
        for (int i = 0; i<=5; i++) {
            for (int j = 0; j <= 5; j++)
                System.out.println(számok [i] [j] + " ");
            System.out.println(" ");
        }
        System.out.println(" A számok átlaga : " + (double) (összeg/36));
    }
}
