package org.example.e88;

import org.example.e87.Car;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'
        // Declare String variables named 'breed', 'name', and 'color'
        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format
        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        // Call the methods 'bark()', 'run()', and 'play()' for each object
        Dog Dog1=new Dog();
        Dog1.name="bahr";
        Dog1.breed="husky";
        Dog1.color="white";
        System.out.println();
        Dog Dog2=new Dog();
        Dog2.name="zoom";
        Dog2.breed="bulldog";
        Dog2.color="brown";
        System.out.println();
        Dog Dog3=new Dog();
        Dog3.name="kiki";
        Dog3.breed="labrador";
        Dog3.color="black";
        Dog1.setDogBreed();

        Dog2.setDogBreed();

        Dog3.setDogBreed();




    }
}
