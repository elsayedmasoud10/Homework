package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];
        for(int row=0;row< table.length;row++){
            for(int col=0;col<table[0].length;col++){
                table[row][col]=(row+3)*(col+3);
            }
        }for(int row=0;row< table.length;row++) {
            for (int col = 0; col < table[0].length; col++) {
                System.out.print(table[row][col]+" ");
            }
            System.out.println();
        }
    }
}

        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern


