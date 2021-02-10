package gyakorlás.hilfe;

public class Függvény {

    static int hatvany(int alap, int kitevo) {
        int eredmeny = 1;
        for (int i = 1; i <= kitevo; i++) {
            eredmeny = eredmeny * alap;
        }
        return eredmeny;
    }

    public static void main(String[] args) {
        System.out.println(hatvany(2, 3));
    }
}
