package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] num = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };


        int a = 0;
        for (int i = 0; i < num[0].length; i++) {
            a += num[0][i];
            }

        System.out.println(a);

        int b = 0;
        for (int i = 0; i < num[0].length; i++) {
            b += num[1][i];
        }

        System.out.println(b);

        int c = 0;
        for (int i = 0; i < num[0].length; i++) {
            c += num[2][i];
        }

        System.out.println(c);

        int d = 0;
        for (int i = 0; i < num[0].length; i++) {
            d += num[3][i];
        }

        System.out.println(d);



    }

    }

