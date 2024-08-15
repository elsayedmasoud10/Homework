package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan =new Scanner(System.in);


        // Print prompt for user to enter gender
        // Capture the gender input
        System.out.println("Please enter your gender: M or F");
        String gender=scan.next();

        // Print prompt for user to enter age
        // Capture the age input
        System.out.println("Please enter your age");
        int age =scan.nextInt();
        // Classify based on gender and age
        if(age>25&&(gender.equalsIgnoreCase("F"))) {

            System.out.println("Women");
        }
        else if (age<=25&&(gender.equalsIgnoreCase("F"))){
            System.out.println("Girl");
                }
        else if (age>25&&(gender.equalsIgnoreCase("M"))) {
            System.out.println("Man");

        }      else if (age<=25&&(gender.equalsIgnoreCase("M"))) {
            System.out.println("Boy");
        }
        }

    }




