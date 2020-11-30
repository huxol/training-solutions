package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {

    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(1000), LengthUnit.CENTIMETER, LengthUnit.CENTIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(100), LengthUnit.CENTIMETER, LengthUnit.MILLIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(10), LengthUnit.MILLIMETER, LengthUnit.CENTIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(1), LengthUnit.METER, LengthUnit.MILLIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(111), LengthUnit.MILLIMETER, LengthUnit.CENTIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(1820), LengthUnit.MILLIMETER, LengthUnit.INCH));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(unitConverter.siUnits());
    }
}