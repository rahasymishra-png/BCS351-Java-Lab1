/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 02 - Decisions and Loops with Numbers

public class Main {
        // Task 1: Check whether a number is even or odd
    static void task1() {
        int n = 27;
                if (n % 2 == 0) System.out.println(n + " is even");
                else System.out.println(n + " is odd");
    }
    // Task 2: Assign a grade using an else-if ladder
    static void task2() {
        int marks = 83;
                if (marks >= 90) System.out.println("Grade: A");
                else if (marks >= 75) System.out.println("Grade: B");
                else System.out.println("Grade: C");
    }
    // Task 3: Check whether a year is a leap year
    static void task3() {
        int year = 2024;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    System.out.println("Leap year");
                else System.out.println("Not a leap year");
    }
    // Task 4: Find factorial of 5 using a for loop
    static void task4() {
        int factorial = 1;
                for (int i = 1; i <= 5; i++) factorial *= i;
                System.out.println("Factorial of 5 is " + factorial);
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
