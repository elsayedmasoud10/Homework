package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        System.out.println("Is it a weekend? (true/false)");
        boolean isWeekend = scan.nextBoolean();
        System.out.println("Are you available? (true/false)");
        boolean isAvailable = scan.nextBoolean();

        if(isWeekend&&isAvailable){
            System.out.println("Today you will be learning Java");
        } else if (!isWeekend&&isAvailable) {
            System.out.println("Today you will be learning Manual Testing");

        } else if (!isAvailable) {
            System.out.println("Today uou will be learning No Subject");

        }


    }
}
