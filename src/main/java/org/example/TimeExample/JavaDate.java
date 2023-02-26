package org.example.TimeExample;

import java.util.Date;

public class JavaDate {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        long year = time / ((long) 1000 * 60 * 60 * 24 * 365);
        System.out.println(year);
        long dayAndMonthWithoutLeap = time % ((long) 1000 * 60 * 60 * 24 * 365);
        System.out.println(dayAndMonthWithoutLeap/((long) 1000 * 60 * 60 * 24) + " dni.");
    }
}

