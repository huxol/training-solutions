package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();
        bill.addItem(new Item("Kenyér", 3, 300));
        bill.addItem(new Item("Tej", 3, 200));
        bill.addItem(new Item("Ásványvíz", 3, 100));

        System.out.println(bill.calculateTotalPrice());
    }
}