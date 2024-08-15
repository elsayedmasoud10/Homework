package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println("Please enter the name of the instructor");
        String instructorName = scan.nextLine();
        switch (instructorName) {
             case "Ashgar":
                 System.out.println("Will take care of Java Assignment");
                 break;
             case "Moazzam":
                 System.out.println("Will take care of SDLC Assignment");
                 break;
            case "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
             default:
                 System.out.println("Invalid instructor selected");
                 break;






         }

        // Determine the responsibility based on the instructor's name using a switch statement


        // Print the responsibility


    }
}
