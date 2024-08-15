package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        int morningExpence= 40;
        int afternoonExpence=120;
        int eveningExpence=200;


        // Calculate total expense
        int totalValue=(morningExpence+afternoonExpence+eveningExpence);
        System.out.println("Your total daily expense is"+" "+totalValue);


        // Define a budget
        int budget = 500;
        if (totalValue<500) {
            System.out.println("You are within the budget");
        }
        else{
            System.out.println("You are over your budget");
        }


        // Check if within budget


    }
}
