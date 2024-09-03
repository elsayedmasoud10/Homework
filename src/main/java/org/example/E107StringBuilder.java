package org.example;

public class E107StringBuilder {
    public static void main(String[] args) {
        // Given string
        String given = "Hello Friends";

        // Instantiate an object of the StringBuffer class with the given string
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(given);

        // Use the reverse() method to reverse the string
        StringBuffer reverse= stringBuffer.reverse();
        System.out.println(reverse);

        // Print the reversed string

    }
}
