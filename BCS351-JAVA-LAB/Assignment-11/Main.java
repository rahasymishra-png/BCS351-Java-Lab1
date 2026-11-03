/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 11 - Bubble Sort and Selection Sort

import java.util.Arrays;
public class Main {
        // Task 1: Sort an array using bubble sort
    static void task1() {
        int[] a = {5, 1, 4, 2, 8};
                for (int i = 0; i < a.length - 1; i++)
                    for (int j = 0; j < a.length - 1 - i; j++)
                        if (a[j] > a[j + 1]) {
                            int temp = a[j]; a[j] = a[j + 1]; a[j + 1] = temp;
                        }
                System.out.println("Sorted: " + Arrays.toString(a));
    }
    // Task 2: Sort an array using selection sort
    static void task2() {
        int[] a = {64, 25, 12, 22, 11};
                for (int i = 0; i < a.length - 1; i++) {
                    int min = i;
                    for (int j = i + 1; j < a.length; j++)
                        if (a[j] < a[min]) min = j;
                    int temp = a[i]; a[i] = a[min]; a[min] = temp;
                }
                System.out.println("Sorted: " + Arrays.toString(a));
    }
    // Task 3: Count swaps in bubble sort
    static void task3() {
        int[] a = {5, 1, 4, 2, 8};
                int swaps = 0;
                for (int i = 0; i < a.length - 1; i++)
                    for (int j = 0; j < a.length - 1 - i; j++)
                        if (a[j] > a[j + 1]) {
                            int temp = a[j]; a[j] = a[j + 1]; a[j + 1] = temp;
                            swaps++;
                        }
                System.out.println("Swaps: " + swaps);
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
