package org.example.RegexExample;

public class MainRegexValidate {
    public static void main(String[] args) {
        String[] passwordArray = {
                "Password1!",
                "Password1!",
                "PasSword1!",
                "Password1&",
                "Password1!",
                "Password1!",
                "Password1%",
                "Password1!",
                "Password1!",
                "Password1!",
                "Password1!",
        };
        long l = System.currentTimeMillis();
        for (String password : passwordArray) {
            boolean valid = JavaLoopValidate.isValid(password);
            //System.out.printf("Password %s isValid: %b\n", password, valid);
        }
        long l2 = System.currentTimeMillis();
        System.out.println();
        long l3 = System.currentTimeMillis();
        for (String password : passwordArray) {
            boolean valid = RegexValidate.isValid(password);
            //System.out.printf("Password %s isValid: %b\n", password, valid);
        }
        long l4 = System.currentTimeMillis();

        System.out.println("Kod wykonany w Javie " + (l2 - l));
        System.out.println("Kod wykonany w Regex " + (l4 - l3));
    }
}
