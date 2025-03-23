// Ryan Monnier 
// CSD 402
// Module 1
// 23-Mar-2025

// Scanner seems to be the most popular way to get user input
import java.util.Scanner;

// Defining a public class
public class Joules {
    // Defining a static class, the void is because we aren't actually 'returning' a value
    public static void main(String[] args) {
        
        // Defining our 'input' variable, which is a Scanner type, which takes system.in user input
        Scanner input = new Scanner(System.in);

        // Get amount of water from user
        System.out.print("How much water are we heating? (in Kg): ");
        double water = input.nextDouble();

        // Get initial temp
        System.out.print("What is the starting temperature? (in C): ");
        double initialtemp = input.nextDouble();

        // Get final temp
        System.out.print("What are we raising the temperature to? (in C): ");
        double finaltemp = input.nextDouble();

        // Calcualte the Joules required
        double energy = water * (finaltemp - initialtemp) * 4184;

        // Results
        System.out.println("This will require: " + energy + " Joules");

        // Closes the scanner
        input.close();
    }
}