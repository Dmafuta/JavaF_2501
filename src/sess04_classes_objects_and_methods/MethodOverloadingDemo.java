package sess04_classes_objects_and_methods;

/**
 * Java program to demonstrate how to use overload methods.
 * @author Administrator
 */
public class MethodOverloadingDemo {
    // main method begins program execution
    public static void main(String[] args) {
        // Variable to be used in the program
        int firstNum = 3, secondNum = 5, thirdNum = 7, fourthNum = 8;
        byte firstByte = 4;
        long answer;
        
        MethodOverloading ml = new MethodOverloading();       
        // Add two integers and display their sum
        ml.addNums(firstNum, secondNum);
        System.out.println("The sum of " + firstNum + " and " + secondNum + " " + "is " + answer);
        
        // Add three integers and display their sum
        ml.addNums(firstNum, secondNum, thirdNum);
        System.out.println("The sum of " + firstNum + " and " + secondNum + " and " + thirdNum + "is " + answer);
        
        // Add a byte & an integer and display their sum
        ml.addNums(firstNum, secondNum);
        System.out.println("The sum of " + firstByte + " and " + firstNum + " " + "is " + answer);
        
        // Add several integers and display their sum
        ml.addNums(firstNum, secondNum, thirdNum, fourthNum, 22, 14, 180);
        System.out.println("The sum of the various intergers" + "is " + answer);
    }
}
