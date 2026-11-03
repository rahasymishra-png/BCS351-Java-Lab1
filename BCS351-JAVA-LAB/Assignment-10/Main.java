/*
 * Student Name : Rahasy Mishra
 * Student ID   : BCS2025548
 */

// Name: ____________________
// Roll Number: ______________
// Assignment: 10 - Switch and ArrayList

import java.util.ArrayList;
public class Main {
        // Task 1: Display a day using switch
    static void task1() {
        int day = 3;
                switch (day) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    default: System.out.println("Invalid day");
                }
    }
    // Task 2: Create and access an ArrayList
    static void task2() {
        ArrayList<Integer> list = new ArrayList<>();
                list.add(10); list.add(20); list.add(30); list.add(40);
                System.out.println(list);
                System.out.println("Size: " + list.size());
                System.out.println("Item at index 2: " + list.get(2));
    }
    // Task 3: Update and remove ArrayList elements
    static void task3() {
        ArrayList<Integer> list = new ArrayList<>();
                list.add(10); list.add(20); list.add(30); list.add(40);
                list.set(1, 25);
                list.remove(3);
                System.out.println(list);
                System.out.println("Size: " + list.size());
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
