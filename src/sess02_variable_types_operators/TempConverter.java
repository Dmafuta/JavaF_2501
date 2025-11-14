package sess02_variable_types_operators;

import java.util.Scanner;

/**
 * Java program that accepts the temprature in degree Celsius and converts it to Degrees fahrenheit
 * @author Administrator
 */
public class TempConverter {
    // Class field variable to hold the input variable
    static Scanner sc;
    
    // main method begins program execution
    public static void main(String[] args) {
        // TODO: complete the program
        // Method variable to be used in the program
        float temperatureF;
        float temperatureC;
        // Instantiate the class variable for user input
        sc = new Scanner(System.in);
        
        // Read in the temperature from the user
        System.out.println("Please enter temperature in Degree fahrenheit");
        temperatureF = sc.nextFloat();
        
        sc.close();
        // convert Ftemperature to Dtemperature
        temperatureC = ((temperatureF - 32) * 5/9);
        System.out.println("=".repeat(55));
        System.out.println("TEMPERATURE CONVERTER");
        System.out.println("=".repeat(55));
        System.out.printf("Temperature in Degree Fahrenheit: %7.2fF%n", temperatureF);
        System.out.printf("Temperature in Degree Celsius: %10.2fC%n", temperatureC);
        System.out.println("-".repeat(55));
        
        
    }
}
