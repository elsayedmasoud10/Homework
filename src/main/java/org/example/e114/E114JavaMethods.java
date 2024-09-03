package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
       add(10,20);
        // Call the multiply method with arguments that multiply to 30
       multiply(10, 3);
        // Call the subtract method with arguments that subtract to 20
       subtract(30,10);
    }

     public static void add(int a,int b){
        int result= a+b;
         System.out.println("addition "+result);

    }
    public static void multiply(int a,int b){
        int result= a*b;
        System.out.println("multiplication " + result);


    }
    public static void subtract(int a,int b){
        int result= a-b;
        System.out.println("subtracton " + result);


    }
    //
    // Create method multiply with two integer parameters and a print statement to display the result

    // Create method add with two integer parameters and a print statement to display the result

    // Create method subtract with two integer parameters and a print statement to display the result

}
