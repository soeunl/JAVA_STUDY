package Study02;

import java.util.Arrays;

public class ArrayTest02 {
    public static void main(String[] args) {
        String ABC[][] = new String[][] {{"A", "C", "E", "G", "I", "K", "M", "O", "Q", "S", "U", "W", "Y"},{"B", "D", "F", "H", "J", "L", "N", "P", "R", "T", "V", "X", "Z"}};

        String abc[][] = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}, {"i", "j"}, {"k", "l"}, {"m", "n"}, {"o", "p"}, {"q", "r"}, {"s", "t"}, {"u", "v"}, {"w", "x"}, {"y", "z"}};

        for (int i = 0; i < ABC.length; i++) {
            for (int j = 0; j < ABC[i].length; j++) {
                System.out.print(ABC[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                System.out.print(abc[i][j] + " ");
            }
            System.out.println();
        }
    }
}
