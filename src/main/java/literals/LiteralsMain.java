package literals;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println(Integer.toString(1) + Integer.toString(2));
        System.out.println("1" + "" + "2");
        System.out.println(1 + "" + 2);

        double quotient1 = 3 / 4;
        double quotient2 = 3 / 4d;
        double quotient3 = 3.0 / 4.0;
        System.out.println(quotient1);
        System.out.println(quotient2);
        System.out.println(quotient3);

        long big = 3_244_444_444L;
        System.out.println(big);

        String str = "árvíztűrőtükörfúrógép";
        System.out.println(str);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}