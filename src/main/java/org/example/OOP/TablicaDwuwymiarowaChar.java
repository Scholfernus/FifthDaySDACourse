package org.example.OOP;

public class TablicaDwuwymiarowaChar {
    public static void main(String[] args) {
        char[][] znaki = {
                {'A', 'B'},
                {'C', 'D'},
                {'E', 'F'},
                {'G', 'H'},
        };
//        printArray(znaki);
    }

    static void printArray(String[][] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.print("[");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
                if (j != tab[i].length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println("]");
                }
            }
        }
    }
}
