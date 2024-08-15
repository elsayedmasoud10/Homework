package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

            int total = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    total += a[i][j];
                }
            }
            System.out.println(total);


        }
        // Use nested loops to iterate through the 2D array and calculate the sum of all elements

        // Print the calculated sum
    }

