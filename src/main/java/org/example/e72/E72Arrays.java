package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan =new Scanner(System.in);

        // Create an array of strings with size 7
        String []days= new String[7];

        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array
         for(int i=0;i< days.length;i++){
             System.out.println("please enter day "+(1+i)+" of the week");
             days[i]= scan.next();
         }
         for(int i=0;i<days.length;i++){
             System.out.println(days[i]);
         }
        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console



    }
}
