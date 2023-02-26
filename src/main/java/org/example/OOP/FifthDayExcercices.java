package org.example.OOP;

import javax.xml.namespace.QName;

public class FifthDayExcercices {
    public static void main(String[] args) {


        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";
        for (String element : daysOfWeek){
            //if (element[]==daysOfWeek[daysOfWeek.length-1])
            System.out.print(element + ", ");
        }
        System.out.println("\nOstatnim elementem zbioru jest: " + daysOfWeek[daysOfWeek.length-1]);

        String [][] dane = new String[3][6];
        String[][] dane2 = {
                {"a1", "a2", "a3", "a4", "a5", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2", "c3", "c4", "c5", "c6"},
        };
        printArray(dane2);
    }
    static void printArray(String[][] tab){

        for (int i = 0; i < tab.length; i++) {
            System.out.print("[");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
                if (j!=tab[i].length-1){
                    System.out.print(", ");
                }
                else {
                    System.out.println("]");
                }
            }

        }
    }
}