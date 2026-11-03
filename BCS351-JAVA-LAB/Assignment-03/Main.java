/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 03 - Star and Number Patterns

public class Main {
        // Task 1: Print a 4 by 4 square of stars
    static void task1() {
        for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) System.out.print("*");
                    System.out.println();
                }
    }
    // Task 2: Print a right triangle of stars
    static void task2() {
        for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++) System.out.print("*");
                    System.out.println();
                }
    }
    // Task 3: Print a number triangle
    static void task3() {
        for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++) System.out.print(j + " ");
                    System.out.println();
                }
    }
    // Task 4: Print an upside-down triangle of stars
    static void task4() {
        for (int i = 4; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) System.out.print("*");
                    System.out.println();
                }
    }

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }
}
