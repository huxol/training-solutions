package gyakorlás;

public class StringFeladatok {

// Írjuk ki a nevünket vízszintesen kicsit széthúzva
// (tegyünk a nevünk betűi közé plusz szóközöket):

    public static void main(String[] args) {
        String név = "Jane Doe";
        for ( int i = 0; i < név.length(); i++) {
            System.out.print(név.charAt(i) + " ");
        }
    }



}
