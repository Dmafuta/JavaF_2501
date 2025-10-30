/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
package sess01_intro2java;

// Bring in the package that contains a class to get input from the user
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GreetUser {
    public static void main(String[] args)
    {
        // Variable to be used in the application
        String username;
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.println("Please enter your name: ");
        
        //Read in the users name
        username = sc.nextLine();
        
        // Close the input string
        sc.close();
        
        // Greet the user
        System.out.println("Hello " + username + " from Java programming");
    }
}
