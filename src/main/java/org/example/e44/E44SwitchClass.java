package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println(("1 for breakfast, 2 for lunch, 3 for dinner"));

        int mealType = scan.nextInt();

        switch (mealType) {
            case 1:
                System.out.println("The price of your meal is $5.0");
                break;
            case 2:
                System.out.println("The price of your meal is $10");
                break;
            case 3:
                System.out.println("The price of your meal is $15");

            default:
                System.out.println("Invalid meal type is entered");
                break;
        }

        }
}
