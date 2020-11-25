package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.subtractTenIfGreaterThanTen(0));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(15));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jack"));

        System.out.println("calculateBonus");
        System.out.println(introControl.calculateBonus(0));
        System.out.println(introControl.calculateBonus(10_000));
        System.out.println(introControl.calculateBonus(1_000_000));
        System.out.println(introControl.calculateBonus(1_000_000));

        System.out.println("calculateConsumption");
        System.out.println(introControl.calculateConsumption(350, 480));
        System.out.println(introControl.calculateConsumption(9900, 120));

        System.out.println("printNumbers");
        introControl.printNumbers(25);
        introControl.printNumbers(33);

        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(10, 30);
        System.out.println("printNumbersBetween - reverse");
        introControl.printNumbersBetween(25, 15);

        System.out.println("PrintOddNumbers - 1");
        introControl.printOddNumbers(1);
        System.out.println("PrintOddNumbers - 10");
        introControl.printOddNumbers(10);
        System.out.println("PrintOddNumbers - 11");
        introControl.printOddNumbers(1);
    }
}
