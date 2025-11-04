package sess03_selection_and_iteration;

/**
 * Java program to display a star patter using nested do... while loops.
 * @author Administrator
 */
public class StartPatterDoWhile {
    
    // main method begins program execution
    public static void main(String[] args) {
        // Variables to be used in the program
        int row = 1, col;
        do // Outer loop
        {
            col = 1; 
            do //Inner loop
            {
                System.out.println("* ");
                col++;
            }while(col <= row);
            System.out.println("");
            row++;
        }while(row <= 5);
    }
}
