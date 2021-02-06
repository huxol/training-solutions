package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String name, List<Integer> monthlyPrices) {
        template = new Contract(name, monthlyPrices);
    }

    public Contract create(String client) {
        return new Contract(client, template.getMonthlyPrices());
    }

    public static void main(String[] args) {
        ContractCreator creator = new ContractCreator("Minta Máté", new ArrayList<>(List.of(10,10,10)));
        Contract contract1 = creator.create("John Doe");
        Contract contract2 = creator.create("Jack Doe");

        System.out.println(contract1);
        System.out.println(contract2);

        contract1.getMonthlyPrices().set(1, 20);
        System.out.println(contract1);
        System.out.println(contract2);
    }
}
