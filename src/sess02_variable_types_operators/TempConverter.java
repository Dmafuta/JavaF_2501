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
        float tempratureF;
        float tempratureC;
        // Instantiate the class variable for user input
        sc = new Scanner(System.in);
        
        // Read in the temprature from the user
        System.out.println("Please enter temprature in Degree fahrenheit");
        tempratureF = sc.nextFloat();
        
        sc.close();
        // convert Ftemprature to Dtemprature
        tempratureC = ((tempratureF - 32) * 5/9);
        System.out.println("=".repeat(55));
        System.out.println("TEMPRATURE CONVERTER");
        System.out.println("=".repeat(55));
        System.out.printf("Temprature in Degree Fahrenheit: %1.2fF%n", tempratureF);
        System.out.printf("Temprature in Degree Celsius: %1.2fC%n", tempratureC);
        System.out.println("-".repeat(55));
        
        
    }
}
