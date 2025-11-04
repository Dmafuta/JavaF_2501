package sess03_selection_and_iteration;

/**
 * Java program that displays the even numbers between 20 - 50 using a loop and the continue keyword
 * @author Administrator
 */
public class EvenNumbersContinue {
    //main method begins program execution
    public static void main(String[] args) {
        // variables to be used in the program
        int num = 20;
        System.out.println("The even numbers between 20 and 50 are: ");
        for( ; num <=50; num++)
        {
            if(num % 2 == 1)
                continue;
            System.out.printf("%d, ", num);
        }
        System.out.println("");
    }
}
