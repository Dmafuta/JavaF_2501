package sess04_classes_objects_and_methods;

import java.util.Scanner;
/**
 * Java program to demonstrate the Simple math class method
 * @author Administrator
 */
public class SimpleMathDemo {
    
    static Scanner sc = new Scanner(System.in);
    // main method begins program execution
    public static void main(String[] args) {
        // prompt the user to be used in the program
        System.out.println("Please enter the first number to be used in the program calculation ->");
        int firstNum = sc.nextInt();
        System.out.println("Please enter the second number to be used in the program calculation ->");
        int secondNum = sc.nextInt();
        
        // Declare and instantiate a SimpleMath class
        SimpleMath sm = new SimpleMath();
        
        // Perform the various arithmetic operations
        long sum = sm.addNums(firstNum, firstNum);
        int difference = sm.subtractNums(firstNum, firstNum);
        long product = sm.multiplyNums(firstNum, firstNum);
        int quotient = sm.divideNums(firstNum, firstNum);
        float exponent = sm.getExponent(firstNum, firstNum);
        int remainder = sm.getModulus(firstNum, firstNum);
        
        // Display the results of the arithmetic operations
        System.out.println("-".repeat(50));
        System.out.println("Results of various arithmetic operations");
        System.out.println("-".repeat(50));
        System.out.printf("%d + %d = %d\n", firstNum, secondNum, sum);
        System.out.printf("%d - %d = %d\n", firstNum, secondNum, difference);
        System.out.printf("%d * %d = %d\n", firstNum, secondNum, product);
        System.out.printf("%d / %d = %d\n", firstNum, secondNum, quotient);
        System.out.printf("%d ^ %d = %d\n", firstNum, secondNum, exponent);
        System.out.printf("%d %% %d = %d\n", firstNum, secondNum, remainder);
        System.out.println("-".repeat(50));
    }
}
