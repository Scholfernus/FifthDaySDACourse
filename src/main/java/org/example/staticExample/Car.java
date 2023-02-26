package org.example.staticExample;

public class Car {
    private static int numberOfInstance = 0;
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfInstance++;
    }

    public static int getNumberOfInstance() {
        return numberOfInstance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
