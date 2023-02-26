package org.example;

import java.lang.reflect.Field;

public class Pola_i_Zmienne {
    public static void main(String[] args) {
        int variableName = 1;
        Integer variableWrap = 1;
    Car carOne = new Car(5,"Ford");
    Car carTwo = new Car(10, "Mazda");
        Field[] declerFields = carOne.getClass().getFields();
        for (int i = 0; i < declerFields.length; i++) {
            System.out.println(declerFields[i].getName());

        }
    }
}
