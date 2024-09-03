package org.example.e122;


    public class Country {
        // Declare instance variables
        private String countryName;
        private String capital;
        private int populationSize;

        // Constructor to initialize the instance variables
        public Country(String countryName, String capital, int populationSize) {
            this.countryName = countryName;
            this.capital = capital;
            this.populationSize = populationSize;
        }

        // Method to display values of instance variables
        public void display() {
            System.out.println("Country Name: " + countryName);
            System.out.println("Capital: " + capital);
            System.out.println("Population Size: " + populationSize);
        }

        // Main method to create objects and use the display method
        public static void main(String[] args) {
            // Create the first object
            Country country1 = new Country("France", "Paris", 67000000);
            // Create the second object
            Country country2 = new Country("Japan", "Tokyo", 126000000);

            // Display the values for the first country
            System.out.println("Country 1:");
            country1.display();
            System.out.println();

            // Display the values for the second country
            System.out.println("Country 2:");
            country2.display();
        }
    }


