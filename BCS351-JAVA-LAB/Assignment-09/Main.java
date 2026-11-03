/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 09 - Matrices: Rows and Columns

public class Main {
        // Task 1: Display the first and last matrix rows
    static void task1() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                System.out.print("First row: ");
                for (int value : m[0]) System.out.print(value + " ");
                System.out.println();
                System.out.print("Last row: ");
                for (int value : m[2]) System.out.print(value + " ");
                System.out.println();
    }
    // Task 2: Calculate the sum of each column
    static void task2() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                for (int j = 0; j < 3; j++) {
                    int sum = 0;
                    for (int i = 0; i < 3; i++) sum += m[i][j];
                    System.out.println("Column " + (j + 1) + " sum: " + sum);
                }
    }
    // Task 3: Count matrix values greater than 5
    static void task3() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                int count = 0;
                for (int[] row : m) for (int value : row) if (value > 5) count++;
                System.out.println("Values greater than 5: " + count);
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
