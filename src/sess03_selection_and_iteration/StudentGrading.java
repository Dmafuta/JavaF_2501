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
    
    // Method to calculate grade based on score
    public static char calculateGrade(int score) {
        if (score >= 70 && score <= 100) {
            return 'A';
        } else if (score >= 60 && score <= 69) {
            return 'B';
        } else if (score >= 50 && score <= 59) {
            return 'C';
        } else if (score >= 40 && score <= 49) {
            return 'D';
        } else if (score >= 0 && score <= 39) {
            return 'E';
        } else {
            return 'I'; // I for Invalid score
        }
    }
     
    // main method begin program execution
    public static void main(String[] args) {
        // Variables to be used in the program
        int scores[] = new int[4];
        int numOfModules = 4;
        int totalScore = 0;
        double averageScore = 0.0;
         
        // String array to store the name of Modules / Subjects
        String[] moduleNames = new String[numOfModules];
        
        System.out.println("Read in name of Modules/Subjects");
        System.out.println("=".repeat(45));
        
        // Read module names
        for(int i = 0; i < numOfModules; i++) {
            System.out.printf("Please enter the name of module %d: ", i + 1);
            moduleNames[i] = sc.nextLine();
            System.out.println("-".repeat(45));
        }
        System.out.println("=".repeat(45));
        System.out.println("Read in the Scores for each module");
        System.out.println("=".repeat(45));
        
        // Read scores for each module
        for(int i = 0; i < numOfModules; i++) {
            System.out.printf("Please enter score for %s: ", moduleNames[i]);
            scores[i] = sc.nextInt();
      
            // Validate score input
            while (scores[i] < 0 || scores[i] > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                System.out.printf("Please enter score for %s: ", moduleNames[i]);
                scores[i] = sc.nextInt();
            }
            totalScore += scores[i];
            System.out.println("-".repeat(45));
        }
        
        // Calculate average score
        averageScore = (double) totalScore / numOfModules;
        
        // Display results
        System.out.println("\n" + "=".repeat(60));
        System.out.println("STUDENT GRADE REPORT");
        System.out.println("=".repeat(60));
        
        for(int i = 0; i < numOfModules; i++) {
            char grade = calculateGrade(scores[i]);
            System.out.printf("%-20s: %3d - %c%n", moduleNames[i], scores[i], grade);
        }
        
        System.out.println("-".repeat(60));
        char averageGrade = calculateGrade((int) Math.round(averageScore));
        System.out.printf("Average Score: %.2f%n", averageScore);
        System.out.printf("Overall Grade: %c%n", averageGrade);
        System.out.println("=".repeat(60));
        
        sc.close();
    }    
}

// Method overloading is a form of compile/static polymorphism