package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        String timeOfday = scan.nextLine();
        switch (timeOfday) {
            case "morning":
                System.out.println("Breakfast");
                break;
            case "afternoon":
                System.out.println("Lunch");
                break;
            case "evening":
                System.out.println("Dinner");
                break;
            case "night":
                System.out.println("Snack");
                break;
            default:
                System.out.println("Invalid time of day entered");
                break;

        }
    }
}

