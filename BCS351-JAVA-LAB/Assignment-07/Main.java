/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 07 - Counting Steps and Complexity

public class Main {
        // Task 1: Count steps in one loop
    static void task1() {
        int steps = 0;
                // Time complexity: O(n)
                for (int i = 1; i <= 10; i++) steps++;
                System.out.println("Steps: " + steps);
    }
    // Task 2: Count steps in nested loops
    static void task2() {
        int steps = 0;
                // Time complexity: O(n^2)
                for (int i = 1; i <= 10; i++)
                    for (int j = 1; j <= 10; j++) steps++;
                System.out.println("Steps: " + steps);
    }
    // Task 3: Count repeated halving steps
    static void task3() {
        int n = 1024, steps = 0;
                // Time complexity: O(log n)
                while (n > 1) { n /= 2; steps++; }
                System.out.println("Halving steps: " + steps);
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
