package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your mark");
        // Capture the mark input
        int marks = scan.nextInt();
        if (marks>=1&&marks<=25) {
            System.out.println("Your grade is F");
        } else if (marks>=26&&marks<=45) {
            System.out.println("Your grade is E");
        } else if (marks>=46&&marks<=50) {
            System.out.println("Your grade is D");
        } else if (marks>=51&&marks<=60) {
            System.out.println("Your grade is C");
        } else if (marks>=61&&marks<=80) {
            System.out.println("Your grade is B");
        } else if (marks>80) {
            System.out.println("Your grade is A");

        }else {
            System.out.println("please enter a valid mark");

    }


    }


        // Determine the grade based on the mark


        // Print the grade
        // Output: Your grade is ____


    }

