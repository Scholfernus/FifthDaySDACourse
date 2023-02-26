package org.example.RegexExample;

public class JavaLoopValidate {
    public static boolean isValid(String password) {
        int digitCounter = 0;
        int length = 0;
        int letterUpperCaseCounter = 0;
        int letterLowerCaseCounter = 0;
        int symbolSpecialCounter = 0;

        char[] chars = password.toCharArray();
        for (Character character : chars) {
            if (Character.isDigit(character)){
                digitCounter++;
            }
            else if (Character.isUpperCase(character)) {
                letterUpperCaseCounter++;
            } else if (Character.isLowerCase(character)) {
                letterLowerCaseCounter++;
            } else if (character == '!' || character == '$' || character == '%') {
                symbolSpecialCounter++;
            }
            length++;
        }
        return length >= 8 && length <= 20 &&letterLowerCaseCounter>0 && letterUpperCaseCounter>0
                && symbolSpecialCounter>0 && digitCounter>0;
    }
}
