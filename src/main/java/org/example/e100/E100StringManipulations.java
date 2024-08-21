package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String str = scan.nextLine();
        String reversed ="";
        for (int i = 0; i <= str.length()-1 ; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
//int i = str.length() - 1; i >= 0; i--








/*

        // Read the input string
        String str = scan.nextLine();
        String to=str.toLowerCase().replaceAll("\\s+", "");
        StringBuilder s=new StringBuilder(to);
        StringBuilder A=(s.reverse());
        System.out.println(s);

*/

