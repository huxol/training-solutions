package exam02;

public class Commas {
    public static void main(String[] args) {
        int [] n = {1, 2, 3, 4, 5, 6, 7, 8};

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < n.length; i++) {
            if(i != 0) {
                sb.append(" , ");
            }
            else {
                first = false;
            }
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
