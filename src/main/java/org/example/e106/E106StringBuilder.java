package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

                // Append the value "Hello" to the StringBuffer
              stringBuffer.append("Hello ");

                // Append the value "World" to the StringBuffer
                stringBuffer.append("World");

                // Convert the StringBuffer content to uppercase and print it
                String upperCaseContent = stringBuffer.toString().toUpperCase();
                System.out.println(upperCaseContent);
            }
        }


