/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 13 - Strings: Methods and Palindromes

public class Main {
        // Task 1: Use String length, indexOf and toUpperCase
    static void task1() {
        String word = "Programming";
                System.out.println("Length: " + word.length());
                System.out.println("Position of g: " + word.indexOf('g'));
                System.out.println("Upper case: " + word.toUpperCase());
    }
    // Task 2: Reverse a word using charAt and a loop
    static void task2() {
        String word = "Java", reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) reversed += word.charAt(i);
                System.out.println("Reversed: " + reversed);
    }
    // Task 3: Check whether a word is a palindrome
    static void task3() {
        String word = "racecar";
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) reversed += word.charAt(i);
                if (word.equals(reversed)) System.out.println(word + " is a palindrome");
                else System.out.println(word + " is not a palindrome");
    }
    // Task 4: Print all substrings in the required order
    static void task4() {
        String word = "abc";
                for (int i = 0; i < word.length(); i++)
                    for (int j = i + 1; j <= word.length(); j++)
                        System.out.println(word.substring(i, j));
    }

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }
}
