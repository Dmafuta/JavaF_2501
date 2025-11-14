package sess05_arrays_and_strings;

import java.util.Scanner;

public class TwoDimArrayScoreAnalysis {
    // main method begins program execution.
    public static void main(String[] args) {

    // Variables to be used in the program
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0; // looping variables
        int numofStudents, numOfModules; // Variables for the no. of students & modules/subjects
        String[] studentNames, moduleNames; // String array for the names of students and modules/subjects
        int[][] studScore; // 2D Integer array for individual student scores
        int[] totalScore; // Integer array for total score of each student
        float[] meanScore; // Float array to hold each student's mean/avg. score
        char[] grade; // Char array to hold each student's grade
        String[] comment; // String array to hold each student's performance comment.

    // Prompt the user for the number of students in the class and read in their names
        System.out.println("How many students are there in the class?");
        numofStudents = sc.nextInt();
        sc.nextLine(); // consume newline
        studentNames = new String[numofStudents]; // instantiate the students names array

        for (n = 0; n < studentNames.length; n++) {
            System.out.print("Enter the name of student " + (n + 1) + ": ");
            studentNames[n] = sc.nextLine();
        }

    // Prompt the user for the number of modules and read in their names
        System.out.println("How many modules are the students taking?");
        numOfModules = sc.nextInt();
        sc.nextLine(); // consume newline
        moduleNames = new String[numOfModules]; // instantiate the modules names array

        for (n = 0; n < moduleNames.length; n++) {
            System.out.print("Enter the name of module " + (n + 1) + ": ");
            moduleNames[n] = sc.nextLine();
        }

    // instantiate the remaining arrays based on the numbers entered
        studScore = new int[numofStudents][numOfModules];
        totalScore = new int[numofStudents];
        meanScore = new float[numofStudents];
        grade = new char[numofStudents];
        comment = new String[numofStudents];

    // ===============================
    // INPUT SCORES FOR EACH STUDENT
    // ===============================
        System.out.println("\n--- Enter the scores for each student ---");
        for (n = 0; n < numofStudents; n++) {
            System.out.println("\nEntering scores for " + studentNames[n] + ":");
            for (i = 0; i < numOfModules; i++) {
                System.out.print("Enter score in " + moduleNames[i] + ": ");
                studScore[n][i] = sc.nextInt();
                totalScore[n] += studScore[n][i]; // accumulate total
            }
            meanScore[n] = (float) totalScore[n] / numOfModules; // compute average
        }

    // ===============================
    // COMPUTE GRADES AND COMMENTS
    // ===============================
        for (n = 0; n < numofStudents; n++) {
            if (meanScore[n] >= 70) {
                grade[n] = 'A';
                comment[n] = "Excellent";
            } else if (meanScore[n] >= 60) {
                grade[n] = 'B';
                comment[n] = "Very Good";
            } else if (meanScore[n] >= 50) {
                grade[n] = 'C';
                comment[n] = "Good";
            } else if (meanScore[n] >= 40) {
                grade[n] = 'D';
                comment[n] = "Fair";
            } else {
                grade[n] = 'F';
                comment[n] = "Fail";
            }
        }

    // ===============================
    // DISPLAY THE RESULTS
    // ===============================
        System.out.println("\n\n========================================");
        System.out.println("STUDENT SCORES ANALYSIS REPORT");
        System.out.println("========================================");
        System.out.printf("%-15s", "Student");
        for (String mod : moduleNames)
            System.out.printf("%-10s", mod);
        System.out.printf("%-10s%-10s%-8s%-15s\n", "Total", "Mean", "Grade", "Comment");
        System.out.println("-------------------------------------------------------------------------------------");

        for (n = 0; n < numofStudents; n++) {
            System.out.printf("%-15s", studentNames[n]);
            for (i = 0; i < numOfModules; i++)
                System.out.printf("%-10d", studScore[n][i]);
            System.out.printf("%-10d%-10.2f%-8c%-15s\n", totalScore[n], meanScore[n], grade[n], comment[n]);
        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Program execution complete. Thank you!");

        sc.close();
    }
}