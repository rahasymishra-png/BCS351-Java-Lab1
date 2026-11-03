/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 04 - Writing Functions

public class Main {
    static long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    static long nCr(int n, int r) { return fact(n) / (fact(r) * fact(n - r)); }
    static long nPr(int n, int r) { return fact(n) / fact(n - r); }
    static int maxOf(int a, int b) { return (a > b) ? a : b; }

        // Task 1: Calculate combination nCr
    static void task1() {
        System.out.println("5C2 = " + nCr(5, 2));
    }
    // Task 2: Calculate permutation nPr
    static void task2() {
        System.out.println("5P2 = " + nPr(5, 2));
    }
    // Task 3: Find the larger of two numbers
    static void task3() {
        System.out.println("Larger: " + maxOf(14, 9));
    }

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
    }
}
