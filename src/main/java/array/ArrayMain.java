package array;

public class ArrayMain {

    public static void main(String[] args) {
        String[] napok = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(napok[1]);
        System.out.println(napok.length);

        int[] kettőHatványai = new int[5];
        kettőHatványai[0] = 1;
        for(int i = 1; i < napok.length; i++) {
            kettőHatványai[i] = kettőHatványai[i - 1] * 2;
        }

        for (int i = 0; i < napok.length; i++) {
            System.out.println(kettőHatványai[i] + " ");
        }

        System.out.println();

        boolean[] labda = new boolean[6];

        for (int i = 1; i < labda.length; i++) {
            labda[i] = !labda[i - 1];
        }

        for (int i = 0; i < labda.length; i++) {
            System.out.println(labda[i] + " ");
        }
    }
}