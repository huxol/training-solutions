package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person = new Person("John Doe", 44);
        Person otherPerson = person;

        otherPerson.setName("Jack Doe");

        System.out.println(person.getName() + " " + person.getAge());
        System.out.println(otherPerson.getName() + " " + otherPerson.getAge());


    }
}
