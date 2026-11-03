/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 08 - Matrices: Transpose and Row Sums

public class Main {
        // Task 1: Create and print a 3 by 4 matrix
    static void task1() {
        int[][] m = new int[3][4];
                int value = 1;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        m[i][j] = value++;
                        System.out.print(m[i][j] + " ");
                    }
                    System.out.println();
                }
    }
    // Task 2: Print the transpose of a matrix
    static void task2() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) System.out.print(m[i][j] + " ");
                    System.out.println();
                }
    }
    // Task 3: Calculate the sum of each row
    static void task3() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                for (int i = 0; i < 3; i++) {
                    int sum = 0;
                    for (int j = 0; j < 3; j++) sum += m[i][j];
                    System.out.println("Row " + (i + 1) + " sum: " + sum);
                }
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
