package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();
        System.out.println(operators.isEven(1));
        System.out.println(operators.isEven(2));
        System.out.println(operators.isEven(12));
        System.out.println(operators.isEven(7));

        System.out.println(Integer.toBinaryString(100));

        System.out.println(16 >> 1);
        System.out.println(16 << 1);
        System.out.println(13 >> 1);
        System.out.println(13 >> 1);

        System.out.println(operators.multiplyByPowerOfTwo(3, 5));
        System.out.println(operators.multiplyByPowerOfTwo(2, 2));
        System.out.println(operators.multiplyByPowerOfTwo(1, 3));

        /*operators.convert();
        operators.cannotConvert();*/
    }
}