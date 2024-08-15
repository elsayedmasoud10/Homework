package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value

    int temperature=25;
    //- If `temperature` is 30 or above, print `"It's hot outside."`.
        //      - If `temperature` is 20 or above, but less than 30, print `"It's warm outside."`.
        //      - If `temperature` is 10 or above, but less than 20, print `"It's cool outside."`.
        //      - If `temperature` is less than 10, print `"It's cold outside."`.
        // Check the temperature and print the message

        if (temperature>=30){
            System.out.println("It's hot outside");
        }

        else if (temperature>=20||temperature<30) {
            System.out.println("Its warm outside");
        }
        else if(temperature>=10||temperature<20){
            System.out.println("Its cool outside");
        }
        else if(temperature<10){
            System.out.println("Its cold outside");
        }
        }
    }

