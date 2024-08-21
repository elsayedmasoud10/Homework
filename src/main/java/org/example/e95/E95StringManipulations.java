package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan=new Scanner(System.in);
        // Prompt the user to input a string value
        System.out.println("Please enter a string:");
        String str= scan.next();
        System.out.println("the first three letter of "+str+" is "+str.substring(0,3));
        System.out.println();

        // Read the input string


        // Extract the first 3 letters using the substring() method

        // Print the result in the specified format
    }
}
