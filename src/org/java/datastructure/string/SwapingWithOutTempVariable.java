package org.java.datastructure.string;

public class SwapingWithOutTempVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:" + " x = " + x + ", y = " + y);

        // second way
        int x1 = 10;
        int y1 = 5;

        // Code to swap 'x' and 'y'
        x1 = x1 * y1; // x now becomes 50
        y1 = x1 / y1; // y becomes 10
        x1 = x1 / y1; // x becomes 5

        System.out.println("After swaping:" + " x1 = " + x1 + ", y1 = " + y1);

        // Third Way
        int x2 = 10;
        int y2 = 5;

        // Code to swap 'x' (1010) and 'y' (0101)
        x2 = x2 ^ y2; // x now becomes 15 (1111)
        y2 = x2 ^ y2; // y becomes 10 (1010)
        x2 = x2 ^ y2; // x becomes 5 (0101)

        System.out.println("After swap: x2 = " + x2 + ", y2 = " + y2);
    }
}
