package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        sumEvenToX(30);
    }

    public static void sumEvenToX(int num1) {
        int sum=0;
        for (int i = 1; i <=num1; i++) {
            if(i%2==0){
                sum+=i;
            }
        }System.out.print(sum);
    }
}