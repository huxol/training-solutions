package week03d04;

import java.util.Scanner;

public class PhoneParser {

    public Phone parsePhone(String s) {
        String prefix = s.substring(0, s.indexOf("-"));
        String number = s.substring(s.indexOf("-") + 1);
        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parsePhone("10-1234567");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone);
    }
}


//* (week03d04)
//Írj egy Phone oszályt, melynek van egy prefix és egy number String attribútuma!
// Írj egy PhoneParser osztályt egy parse(String) metódussal, ami beolvas
// egy 10-1234567 formátumú szöveget, és visszaad egy Phone objektumot,
// feltöltve a prefix értékét 10, a number értékét 1234567 értékekkel!
