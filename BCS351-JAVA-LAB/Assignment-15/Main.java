/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 15 - StringBuilder Methods

public class Main {
        // Task 1: Append text and print StringBuilder length
    static void task1() {
        StringBuilder sb = new StringBuilder("Hello");
                sb.append(" World");
                System.out.println(sb);
                System.out.println("Length: " + sb.length());
    }
    // Task 2: Append numbers and remove the final comma
    static void task2() {
        StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 5; i++) sb.append(i).append(',');
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);
    }
    // Task 3: Insert text at the beginning
    static void task3() {
        StringBuilder sb = new StringBuilder("Java");
                sb.insert(0, "Hello ");
                System.out.println(sb);
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
