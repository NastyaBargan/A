/**
 * Java 1. Homework 2
 *
 * author Bargan Nastya
 * @version 27.3.2022
 */

package Homework2;

public class Homework2 {

    public static void main(String[] args) {
        System.out.println(checkSum (6, 7));
        System.out.println(checkNumb (-3));
        System.out.println(crissCross (77));
        printString ("Hello!", 4);
    }

    static boolean checkSum (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static String checkNumb (int n) {
        return n >= 0? "Положительное" : "Отрицательное";
    }

    static boolean crissCross (int i) {
        return i < 0;
    }

    static void printString (String s, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(s);
        }
    }
}
