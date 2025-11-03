package sess03_selection_and_iteration;

import java.util.Scanner;
/**
 * Java program to demonstrate the various selection/descision/conditional construct
 * @author Administrator
 */
public class JavaSelectionConstructs {
    // Class variable to be used for user input
    static Scanner sc = new Scanner(System.in);
    
    // main method begin program execution
    public static void main(String[] args) {
        // variables to be used in the program
        float temperature;
        String password = " ";
        
        // Get the temprature
        System.out.println("Please enter today's temprature in degrees Celsius");
        temperature = Float.parseFloat(sc.nextLine());
        
        // 1. if
        System.out.println("=".repeat(62));
        System.out.println("1. IF SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        if(temperature > 25.0f)
            System.out.println("Hooray, its's a warm day, lets head to the beach 🍹");
        if(password == "")
            System.out.println("Please enter your password!");
        
        System.out.println("=".repeat(62));
        System.out.println("1. IF.. ELSE SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        //2. if... else
        System.out.println("Please enter a number and I'll tell you if its odd or even");
        int userNum = Integer.parseInt(sc.nextLine().trim());
        if(userNum % 2 == 1)
            System.out.printf("%n%d is an odd number! \n", userNum);
        else
            System.out.printf("%n%d is an even number! \n", userNum);
        
        System.out.println("Please enter the student score in the exam");
        int score = Integer.parseInt(sc.nextLine());
        if(score >= 40)
            System.out.printf("\nCongradulation with score of %d you've passed your exam!\n", score);
        else
            System.out.printf("\nUnfortunately, with a score of %d you've failed your exam!\n", userNum);
        
        // System.out.printf(score >= 40?"\nCongradulation with score of %d you've passed your exam!":"Unfortunately, with a score of %d you've failed your exam!");
        
        //3. if... else if... else
        System.out.println("=".repeat(62));
        System.out.println("3. IF... ELSE IF... ELSE SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        // Grade the student based on their score
        if(score >= 70 && score <= 100)
            System.out.printf("\nWith a score of %d, you got grade 'A'\n", score);
        else if (score >= 60)
            System.out.printf("\nWith a score of %d, you got grade 'B'\n", score);
        else if (score >= 50)
            System.out.printf("\nWith a score of %d, you got grade 'C'\n", score);
        else if (score >= 40)
            System.out.printf("\nWith a score of %d, you got grade 'D'\n", score);
        else
            System.out.printf("\nWith a score of %d, you got grade 'E'\n", score);
        
        //4. Switch... case
        System.out.println("=".repeat(62));
        System.out.println("4. SWITCH... CASE CONSTRUCT");
        System.out.println("=".repeat(62));
        // Check if a day of the week is on a weekday or weekend
        //Prompt the user for the day of the week
        System.out.println("Please enter the day of the week ->");
        String day = sc.nextLine().trim().toLowerCase(); //read in, remove leading & 
                //trailing whitespaces and converts for case sensitive day comparison
        
        // Java 17+ pattern matching switch
        switch(day){
            case "monday", "tuesday","wednesday","thursday","friday" ->
                System.out.println("\n" + day + " is a weekday");
            case "saturday","sunday"->
                System.out.println("\n" + day + " is a weekend");
            default ->
            {
                System.out.println("sorry, " + day + " is not a valid day of the week");
                System.exit(0); //
            }
        }    
        // Java <17 classic switch... case
        switch(day)
        {
            case "monday":
            case "tuesay":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("\n" + day + " is a weekday");
                break;
            case "saturday","sunday":
                System.out.println("\n" + day + " is a weekend");
            break;
            default:
                System.out.println("sorry, " + day + " is not a valid day of the week");
                System.exit(0); //
        }
        sc.close();
    }
}
