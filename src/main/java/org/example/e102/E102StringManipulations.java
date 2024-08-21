package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner scanner = new Scanner(System.in);
        System.out.print("In:");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i ++) {
            System.out.println(word.charAt(i));
        }


        // Use a for loop to iterate through the string and print each character on a separate line

    }
}
