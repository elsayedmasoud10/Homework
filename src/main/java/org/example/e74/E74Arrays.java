package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console

        Scanner scan =new Scanner(System.in);
        // Create an array of integers with a size of 5
        int []days= new int[5];
        for(int i=0;i< days.length;i++) {
            days[i]= scan.nextInt();
        }
        for(int i=0;i< days.length;i++) {
            System.out.println(days[i]*10);
        }scan.close();
        // Use another loop to multiply each element of the array by 10 and print the result

    }
}
