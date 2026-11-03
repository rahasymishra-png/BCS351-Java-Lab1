/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 01 - Hello World, Variables and Arithmetic

public class Main {
        // Task 1: Print Hello World and Welcome to Java
    static void task1() {
        System.out.println("Hello World");
                System.out.println("Welcome to Java");
    }
    // Task 2: Print variables with labels
    static void task2() {
        int roll = 101;
                double percentage = 84.5;
                char section = 'B';
                String name = "Asha";
                System.out.println("Roll: " + roll);
                System.out.println("Percentage: " + percentage);
                System.out.println("Section: " + section);
                System.out.println("Name: " + name);
    }
    // Task 3: Perform arithmetic operations
    static void task3() {
        int a = 17, b = 5;
                System.out.println("Sum: " + (a + b));
                System.out.println("Difference: " + (a - b));
                System.out.println("Product: " + (a * b));
                System.out.println("Quotient: " + (a / b));
                System.out.println("Remainder: " + (a % b));
    }
    // Task 4: Calculate circle area and perimeter using PI
    static void task4() {
        final double PI = 3.14;
                int radius = 7;
                System.out.printf("Area: %.2f%n", PI * radius * radius);
                System.out.printf("Perimeter: %.2f%n", 2 * PI * radius);
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
