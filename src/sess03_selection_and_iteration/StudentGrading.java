package sess03_selection_and_iteration;

import java.util.Scanner;

/**
 * Write a Java program that accepts the scores of a student in four subjects/module
 * The program then calculates the student's average score and grade them using the criteria below
 * 70 - 100: A
 * 60 - 69:  B
 * 50 - 59:  C
 * 40 - 49:  D
 *  0 - 39:  E
 * @author Administrator
 */
public class StudentGrading {
    // Class variable to be used for user input
    static Scanner sc = new Scanner(System.in);
    
    // main method begin program execution
    public static void main(String[] args) {
        // Variables to be used in the program
        int scores[] = new int[4];
        int numOfModules = 4;
        int averageScore = 0; // Initialize the average score to zero
        
        // String array to store the name of Modules / Subjects
        String[] moduleNames = new String[numOfModules];
        System.out.println("Read in name of Modules/Subjects");
        System.out.println("=".repeat(45));
        for(int i = 0; i < numOfModules; i++ )
        {
            
            System.out.printf("Please enter the name of module: ");
            moduleNames[i] = sc.nextLine();
            System.out.println("-".repeat(45));
        }
    
        System.out.printf("=".repeat(45));
        System.out.printf("Read in the Scores for each module%n");
        System.out.println("=".repeat(45)); 
        for(String s: moduleNames) // Iterate over the array of Modules/Subjects           
            
        // read in scores for each module     
        for(int j = 1; j < numOfModules - 2; j++)
        {
//            int totalScore = 0;
            System.out.printf("Please enter score for %s: ", s);
            scores[j] = sc.nextInt();
            System.out.println("-".repeat(45));
            
//            totalScore = sc.nextInt();
//            totalScore += scores[j];
//            System.out.printf("%d", totalScore);
        }
    sc.close();
    }   
}
