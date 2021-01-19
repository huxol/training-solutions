package gyakorlás.alapok;

public class Tömbök {


    /* Készíts programot, amely egy 20 elemű tömböt feltölt 'a' karakterekkel,
    majd a tömb minden 2. elemét kicseréli 'b' karakterre, majd kiírja egymás
    mellé az elemeket, szóközzel elválasztva! */

    public static void main(String[] args) {
        char [] tömb = new char[20];
        for (int i=0; i<=19; i++) {
            tömb [i] = 'a';
        }
        for (int i=1; i<=19; i+=2) {
            tömb [i] = 'b';
        }
        for (int i =0; i<=19; i++)
            System.out.println(tömb [i] + " ");
    }

}

    /* Írjál programot, amely a következő tartalmú tömböt hozza létre, majd ki is írja a képernyőre!
        0    1    2
        3    4    4
        0    0    0

    public static void main(String[] args) {
        int [] [] tömb = {
                {0,1,2},
                {3,4,4},
                {0,0,0}
        };
        for (int i=0; i<=2; i++) {
            for (int j =0; j <=2; j++)
                System.out.println(tömb[i] [j] + " ");
        }
    } */

