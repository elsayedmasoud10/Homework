package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        bothEven(11, 30);
    }
    public static void bothEven(int num1, int num2) {
        if (num1%2==0&&num2%2==0){
            System.out.println(true);

        }else{
            System.out.println(false);
        }

    }
}
