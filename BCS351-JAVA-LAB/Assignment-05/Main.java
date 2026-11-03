/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 05 - Arrays: Traversal and Counting

public class Main {
        // Task 1: Display array elements with their indexes
    static void task1() {
        int[] arr = {3, 4, 5};
                for (int i = 0; i < arr.length; i++)
                    System.out.println("Index " + i + ": " + arr[i]);
    }
    // Task 2: Find array sum and largest value
    static void task2() {
        int[] arr = {12, 45, 7, 33, 21};
                int sum = 0, largest = arr[0];
                for (int value : arr) {
                    sum += value;
                    if (value > largest) largest = value;
                }
                System.out.println("Sum: " + sum);
                System.out.println("Largest: " + largest);
    }
    // Task 3: Count values greater than 10
    static void task3() {
        int[] arr = {5, 12, 2, 14, 7};
                int count = 0;
                for (int value : arr) if (value > 10) count++;
                System.out.println("Count greater than 10: " + count);
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
