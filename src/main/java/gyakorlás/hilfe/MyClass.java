package gyakorlás.hilfe;

public class MyClass {

    private int param1;
    private int param2;

    public MyClass() {
        param1 = 0;
        param2 = 0;
    }

    public MyClass(int param1, int param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public int getSum() {
        return param1 + param2;
    }

    public int getProduct() {
        return param1 * param2;
    }
}

/* Main.java
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(2, 3);
        System.out.println(myClass.getSum());
        System.out.println(myClass.getProduct());
    }

    A println() és print() metódusok között annyi a különbség, hogy
    a println() úgy írja ki az adott szöveget, hogy utána új sort kezd.
    A print() pedig a kurzort a sor végén hagyja, vagyis a kiírt szövegek egymás mellé kerülnek.
-----

     Osztalynev.metodus( parameter1, parameter2, … );
    */
