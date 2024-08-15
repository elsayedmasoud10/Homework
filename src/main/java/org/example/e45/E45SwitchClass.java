package org.example.e45;


import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println("1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha");
        int coffeeType = scan.nextInt();

        switch (coffeeType) {
            case  1:
                System.out.println("Espresso costs $3.00");
                break;
            case  2:
                System.out.println("Latte costs $4.00");
                break;
            case 3:
                System.out.println(" Cappuccino costs $4.50");
                break;
            case 4:
                System.out.println("mocha cost $5");
                break;
                default:
                System.out.println("Invalid coffee type entered");
                break;


        }

    }
}
