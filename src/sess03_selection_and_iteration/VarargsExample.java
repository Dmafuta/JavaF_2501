package sess03_selection_and_iteration;
/**
 *
 * @author Administrator
 */
public class VarargsExample {

    public static void printNumbers(int... numbers) 
    {
        System.out.print("Received numbers: ");
        for (int num : numbers) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        printNumbers(); // Calling with no arguments
        printNumbers(10); // Calling with one argument
        printNumbers(1, 2, 3, 4, 5, 15); // Calling with multiple arguments
    }
}
