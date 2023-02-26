package org.example.TimeExample;

import java.time.*;

public class TimeExcercises {
    public static void main(String[] args) {


        LocalTime time = LocalTime.now();
        System.out.println("Teraz jest: " + time);
        System.out.printf("%d:%d:%d\n",time.getHour(),time.getMinute(),time.getSecond());
        LocalTime currentTimeAferSoleMiliSec = LocalTime.now();
        boolean before = time.isBefore(currentTimeAferSoleMiliSec);
        System.out.println(before);
        boolean after = time.isAfter(currentTimeAferSoleMiliSec);
        System.out.println(after);

        LocalTime currentTimeWithZeroSecAndZeroNano = LocalTime.now().withSecond(10).withNano(5);
        System.out.println(currentTimeWithZeroSecAndZeroNano);

        LocalTime time1 = LocalTime.now();
        time.plusHours(2);
        System.out.println(time);
        time1 = time1.plusHours(1);
        System.out.println(time1);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = LocalDate.of(1990, Month.MARCH,26);
        LocalDate date2 = LocalDate.of(1990, 12,26);
        System.out.println(date1);
        System.out.println(date2);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.getDayOfYear();
        System.out.println(localDateTime);
    }
}
