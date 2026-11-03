/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 14 - Characters: Counting and Positions

public class Main {
        // Task 1: Count vowels in a string
    static void task1() {
        String s = "programming";
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
                }
                System.out.println("Vowels: " + count);
    }
    // Task 2: Count occurrences of letter g
    static void task2() {
        String s = "programming";
                int count = 0;
                for (int i = 0; i < s.length(); i++) if (s.charAt(i) == 'g') count++;
                System.out.println("Count of g: " + count);
    }
    // Task 3: Print each character with its position
    static void task3() {
        String s = "hello";
                for (int i = 0; i < s.length(); i++)
                    System.out.println(i + ": " + s.charAt(i));
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
