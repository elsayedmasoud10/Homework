package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char c =Character.toLowerCase((word.charAt(i)));
            if (c=='a'||c=='e'||c=='i'||c=='c'||c=='o'||c=='u') {
                System.out.print(c);
            }
            // Use a for loop to iterate through the string and print only the vowels
            // (Your code goes here)
        }
    }
}