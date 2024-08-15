package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
         String operator="+";



        // Declare two variables for numbers and assign values
        int num1=10;
        int num2=40;
        if (operator=="-"){
            System.out.println(num1-num2);
        }

        else if (operator=="+") {
            System.out.println(num1+num2);
        }
        else if(operator=="*"){
            System.out.println(num1*num2);
        }
        else if(operator=="/"){
            System.out.println(num1/num2);
        }


        // Perform the corresponding arithmetic operation

    }
}
