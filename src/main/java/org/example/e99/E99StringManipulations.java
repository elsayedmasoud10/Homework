package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan=new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");
        // Read the input string
        String str= scan.nextLine();
       String to=str.toLowerCase().replaceAll("\\s+", "");
        System.out.println(to);
        StringBuilder s=new StringBuilder(to);
            StringBuilder A=(s.reverse());
            String b= (A.toString());
            if (to.equals(b)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise
    }
}
