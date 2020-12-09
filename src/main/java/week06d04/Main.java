package week06d04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Budget budget = new Budget(Arrays.asList(
                new Item(1200, 11, "fogkefe"),
                new Item(300, 10, "zabkeksz"),
                new Item(1300, 12, "habzóbor")

        ));

        System.out.println(budget.getItemsByMonth(1));
        System.out.println(budget.getItemsByMonth(12));
    }
}
