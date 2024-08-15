package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("Please enter 3 distinct numbers separated by spaces");

        // Capture the three numbers input
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();



        // Use nested if-else statements to find the largest number
        if(num1>num2&&num1>num3){
            System.out.println(num1 +" is the largest");
        }else if(num2>num1&&num2>num3){
            System.out.println(num2 +" is the largest");

        } else if(num3>num1&&num3>num2){
            System.out.println(num3 +" is the largest");

        }else {
            System.out.println("Invalid input");
        }


    }
}
