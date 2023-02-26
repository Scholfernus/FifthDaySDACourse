package org.example.RegexExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamplefifthDay {
    public static void main(String[] args) {
        String name = "Joanna";
        String name2 = "Joachim ma kota";

        if (name.matches("[a-zA-Z]+")) {
            System.out.println("Imię jest poprawne.");
        } else {
            System.out.println("Imię jest niepoprawne");
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(name2);
        if (matcher.matches()) {
            System.out.println("Imię jest poprawne.");
        } else {
            System.out.println("Imię jest niepoprawne");
        }
        // ę jest polskim znakiem, wywołuje niepoprawne, jeżeli dodamy do nawiasów kwadratowych ę, wówczas imię będzie poprawne
        String word = "Imię:";
        if (word.matches("[a-zA-Z]+")) {
            System.out.println("Imię jest poprawne.");
        } else {
            System.out.println("Imię jest niepoprawne");
        }
        Pattern pattern2 = Pattern.compile("[a-zA-Z]+");
    String[] array = {
                "bcd",
                "abcd",
                "aabcd",
                "aaaaaaabcd"
        };
        for (int i = 0; i < array.length; i++) {
            Matcher matcher1 = pattern2.matcher(array[i]);
            if (matcher1.matches()){
                System.out.println("Słowo jest poprawne");
            }else {
                System.out.println("Słowo nie jest poprawne");
            }
        }
        String []dates = new String[5];
        String date1 = "10:11:1983";
        String date2 = "10/11/1983";
        String date3 = "10-11-1983";
        String date4 = "10-12-1860";
        String date5 = "10-13-2000";

        dates[0] = date1;
        dates[1] = date2;
        dates[2] = date3;
        dates[3] = date4;
        dates[4] = date5;


        String regex = "(0?[1-9]|[12][0-9]|3[01])[:/-](0?[1-9]|1[012])[:/-]((19|20)[0-9][0-9])";
        Pattern patternDate = Pattern.compile(regex);
        for (String date: dates) {
            Matcher matcher1 = patternDate.matcher(date);
            if (matcher1.matches()) {
                System.out.printf("Data %s, odpowiada naszym wymaganiom\n", date);
            } else {
                System.out.printf("Data %s, nie odpowiada naszym wymaganiom\n", date);
            }
//        System.out.println(pattern1);}
        }
    }
}
