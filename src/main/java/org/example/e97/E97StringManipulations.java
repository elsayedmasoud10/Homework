package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        // Prompt the user to input a browser name
        // Read the input string
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a browser name:");
        String programming = scan.next();

        if (programming.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");

        } else if (programming.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        }else if(programming.equalsIgnoreCase("IE")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }



        // Use conditional statements to print the message based on the input
        // If the input is "Chrome", "chrome", "CHROME", or "ChRoMe", print "Proceed with Chrome browser"
        // If the input is "firefox", "FIREFOX", or "FireFOX", print "Proceed with Firefox browser"
        // If the input is "IE", "ie", or "iE", print "Proceed with IE browser"
        // For any other input, print "Invalid browser"
    }
}
