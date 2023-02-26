package org.example.OOP;

public class Telefon {
    private int number;
    private String model;
    private double weight;

    public int age;

    public Telefon(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Telefon(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Telefon() {
    }

    ;

    public double getWeight() {
        return weight;
    }

    public void receiveCall(int number) {
        System.out.println("Number calling is: " + number);
    }

    public void receiveCallName(String name) {
        System.out.println("Name calling is: " + name);
    }
    public void receiveCall(String name, int number){
        System.out.printf("%s dzwoni do Ciebie z %d numeru.", name, number);
    }
    public void sendMesage(int... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Wysłano wiadomość do numeru: %d", numbers);
        }
    }

    @Override

    public String toString() {
        return String.format("Phone [ number = %d, model = %s, weight = %4f ]", this.number, this.model, this.weight);/* "Telefon{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}'*/
    }
}
