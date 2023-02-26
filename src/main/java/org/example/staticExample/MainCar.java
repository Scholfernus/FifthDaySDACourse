package org.example.staticExample;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 5);
        Car car2 = new Car("Mercedes", 1);
        Car car3 = new Car("Toyota", 10);

        System.out.println("Ilość stworzonych obiektów -> " + Car.getNumberOfInstance());


    }
}
