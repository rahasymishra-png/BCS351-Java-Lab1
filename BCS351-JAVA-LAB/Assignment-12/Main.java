/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 12 - Insertion Sort

import java.util.Arrays;
public class Main {
        // Task 1: Sort an array using insertion sort
    static void task1() {
        int[] a = {7, 3, 5, 1};
                for (int i = 1; i < a.length; i++) {
                    int key = a[i], j = i - 1;
                    while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
                    a[j + 1] = key;
                }
                System.out.println("Sorted: " + Arrays.toString(a));
    }
    // Task 2: Sort a second array using insertion sort
    static void task2() {
        int[] a = {14, 3, 9, 21, 6};
                for (int i = 1; i < a.length; i++) {
                    int key = a[i], j = i - 1;
                    while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
                    a[j + 1] = key;
                }
                System.out.println("Sorted: " + Arrays.toString(a));
    }
    // Task 3: Count shifts in insertion sort
    static void task3() {
        int[] a = {6, 5, 4, 3, 2, 1};
                int shifts = 0;
                for (int i = 1; i < a.length; i++) {
                    int key = a[i], j = i - 1;
                    while (j >= 0 && a[j] > key) {
                        a[j + 1] = a[j]; j--; shifts++;
                    }
                    a[j + 1] = key;
                }
                System.out.println("Shifts: " + shifts);
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
