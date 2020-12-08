package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        int occurrence = email.indexOf("@");
        if (!email.contains("@") || !email.substring(occurrence).contains(".")) {
            throw new IllegalArgumentException( " Hibás az email cím! ");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

//* Készíts egy osztályt week05d05.User néven, melynek van egy firstName (String), egy lastName (String) és
// egy email (String) mezője. Legyen ellenőrzés az User konstruktorában, mely hibát jelez,
// ha nincs @ és . (pont) az e-mail cimben! Készíts egy metódust is getFullName névvel, mely visszaadja
// a firstName és a lastName változókat összefűzve. Legyen közöttük egy whitespace (" ").
//Bónusz feladat: írjunk teszteket
