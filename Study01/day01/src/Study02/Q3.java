package Study02;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        //  int[] five = new int[] {2, 4, 6, 8, 10};

        int[] five = new int[5];

        five[0] = 2;
        five[1] = 4;
        five[2] = 6;
        five[3] = 8;
        five[4] = 10;

        System.out.print("배열 요소: ");
        for (int number : five) {
            System.out.print(number + " ");
        }

        System.out.println();

        int result = Arrays.stream(five).sum();
        System.out.println("배열의 합: " + result);
    }
}
