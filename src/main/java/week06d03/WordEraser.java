package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String[] temp = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : temp) {
            if(!s.equals(word)) {
                sb.append(s + " ");
            }
        }
        return sb.toString().trim();
    }



}

//* A week06d03.WordEraser osztályban legyen egy eraseWord(String words, String word) metódus,
// mely az első paraméter szöveget úgy változtatja meg, hogy a második paraméter
// összes előforulását kitörli belőle. A words paraméterben a szavak szóközzel vannak elválasztva.
// A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
// (Mellőzzük a replace és replaceAll használatát)
