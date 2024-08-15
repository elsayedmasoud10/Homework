package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[10][10];
for(int row=5;row< table.length;row++){
    for(int col=0;col<table[0].length;col++){
      table[row][col]=(row+1)*(col+1);
    }
}for(int row=5;row< table.length;row++) {
            for (int col = 0; col < table[0].length; col++) {
                System.out.print(table[row][col]+" ");
            }
            System.out.println();
        }
    }
}
