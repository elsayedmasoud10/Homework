package org.example.e42;

import java.util.Scanner;

public class E42SwitchClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println("1 for Monday, 2 for Tuesday, ..., 7 for Sunday");
        String timeOfweek = scan.nextLine();

        switch (timeOfweek) {
            case "Monday":
                System.out.println("Go to the gym");
                break;
            case "Tuesday":
                System.out.println("Attend a coding meetup");
                break;
            case "Wednesday":
                System.out.println("Go for a mid-week run");
                break;
            case "Thursday":
                System.out.println("Take a cooking class");
                break;
            case "Friday":
                System.out.println("Movie night");
                break;
            case "Saturday":
                System.out.println("Movie night");
                break;
            case "Sunday":
                System.out.println("Relax and recharge");
                break;
            default:
                System.out.println("Invalid day entered");
                break;


        }

        }
}
