/**
 * Java 1. Homework 2
 *
 * author Bargan Nastya
 * @version 27.3.2022
 */

package Homework2;

public class Homework2 {

    public static void main(String[] args) {
        System.out.println(CheckSum (2, 7));
        System.out.println(CheckNumb (-3));
        System.out.println(CrissCross (77));
        PrintString (3);
    }

    static boolean CheckSum (int a, int b) {
        int c = a + b;
        return (10 <= c) && (20 >= c);
    }

    static String CheckNumb (int n) {
        return n >= 0? "Положительное" : "Отрицательное";
    }

    static boolean CrissCross (int i) {
        return 0 > i;
    }

    static void PrintString (int s) {
        for (int j = 0; j < s; j++) {
            System.out.println("Hello world!");
        }
    }
}
