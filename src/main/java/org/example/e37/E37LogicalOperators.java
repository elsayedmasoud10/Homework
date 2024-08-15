package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to answer if they are thirsty
        System.out.println("are you thristy?  (true/false)"  );
        boolean isThursty = scan.nextBoolean();

        // Print prompt for user to answer if they are sleepy
        // Capture the sleepy input
        System.out.println("are you sleepy?  (true/false)" );
        boolean isSleepy = scan.nextBoolean();

        // Determine the drink based on the inputs
        if (isThursty&&!isSleepy) {
            System.out.println("Drink " + "Water");
        } else if (isThursty && isSleepy) {
            System.out.println("Drink " + "Coffee");

        } else if (!isThursty&&isSleepy) {
            System.out.println("Drink " + "Tea");
        } else {
            System.out.println("Drink Nothing");
        }
    }
}
