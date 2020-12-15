package week07d05;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println(vehicle.getTransmissionType());
        System.out.println(car.getTransmissionType());
        System.out.println(motorcycle.getTransmissionType());
        System.out.println(motorcycle.getNumberOfGears());
    }
}
