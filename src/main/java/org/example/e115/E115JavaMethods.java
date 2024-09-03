package org.example.e115;

public class E115JavaMethods {

        public static String convertToUpper (String input){
            // Convert the string to uppercase
            return input.toUpperCase();
        }

        public static void main (String[]args){
            // Example string to convert
            String originalString = "test";

            // Call the convertToUpper method and store the result
            String upperCaseString = convertToUpper(originalString);

            // Print the result
            System.out.println(upperCaseString);
        }
    }

