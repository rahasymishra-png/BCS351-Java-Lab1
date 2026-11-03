/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 06 - Arrays: Reverse and Duplicates

public class Main {
        // Task 1: Print array values in reverse order
    static void task1() {
        int[] arr = {10, 20, 30, 40, 50};
                for (int i = arr.length - 1; i >= 0; i--) System.out.println(arr[i]);
    }
    // Task 2: Find the smallest value and its index
    static void task2() {
        int[] arr = {2, 5, 1, 8, 3, 4};
                int smallest = arr[0], index = 0;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < smallest) { smallest = arr[i]; index = i; }
                }
                System.out.println("Smallest: " + smallest + " at index " + index);
    }
    // Task 3: Find a repeated array value
    static void task3() {
        int[] arr = {4, 9, 2, 9, 7};
                boolean found = false;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            System.out.println("Repeated value: " + arr[i]);
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (!found) System.out.println("No repeated value");
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
