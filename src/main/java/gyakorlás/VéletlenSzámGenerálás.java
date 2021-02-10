package gyakorlás;

public class VéletlenSzámGenerálás {

    public static void main(String[] args) {
        int szám1 = (int) (Math.random() * 101);
        int szám2 = (int) (Math.random() * 101);
        System.out.println(" Az első szám: " + szám1);
        System.out.println(" A második szám: " + szám2);

        if (szám1 > szám2) System.out.println("A két szám különbsége = " + (szám1 - szám2));
        else System.out.println("A két szám különbsége = " + (szám2 - szám1));
    }
}

//  Készíts programot, ami generál két véletlen egész számot [0;100] intervallumban.
//  A nagyobbik számból vonja ki a kisebbet, és írja ki a végeredményt.

// (int)( Math.random()*(felső-alsó+1) )+alsó;
