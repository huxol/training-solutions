package attributes.person;

public class Address {

    private String country;

    private String city;

    private String streetAndNumber;

    private String zipCode;

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this. zipCode = zipCode;
    }

    public void correctData(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this. zipCode = zipCode;
    }

    public String addressToString() {
        return getCountry() + " , " +
                getZipCode() + " , " +
                getCity() + " , " +
                getStreetAndNumber();
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }
}

//*Hozz létre egy attributes.person.Person osztályt, String name, String identificationCard attribútumokkal!
// Az osztályban hozz létre egy String personToString() metódust, mely szövegként adja vissza a Person adatait!
//
//Hozz létre egy Address osztályt, String country, String city, String streetAndNumber, String zipCode attribútumokkal!
// Az osztályban hozz létre egy String addressToString() metódust, mely szövegként adja vissza az Address adatait!
//
//Az attribútumok konstruktorban is megadhatóak legyenek, és legyenek getter metódusok.
// Legyen egy correctData() metódus mindkét osztályban, mellyel át lehet írni az összes paraméter értékét!
//
//A Person osztály tartalmazzon egy hivatkozást az Address osztályra! (Azaz legyen a Person osztálynak
// egy Address típusú attribútuma! Legyen egy moveTo(Address) metódus, mely beállítja a címet, és egy getAddress(),
// mellyel lekérdezhetővé válik!
//
//Teszteld az osztályokat a PersonMain main() metódusában!*/
