package week03d04;

import org.junit.jupiter.api.Test;
import week03d04.Phone;
import week03d04.PhoneParser;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PhoneParserTest {

    @Test

    void testParsePhone() {

        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parsePhone("10-1234567");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone);

        assertEquals("10", phone.getPrefix());
        assertEquals("1234567", phone.getNumber());

    }


}
