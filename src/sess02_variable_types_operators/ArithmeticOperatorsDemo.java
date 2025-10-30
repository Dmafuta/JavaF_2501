package sess02_variable_types_operators;

/**
 * Java program to demonstrate the various arithmetic and compound operators. 
 * @author Administrator
 */
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("#".repeat(62));
        System.out.println(" JAVA ARITHMETIC OPERATORS DEMONSTRATION");
        System.out.println("#".repeat(62));
        
        // variable to be used in the program
        int a = 10, b = 3;
        double x = 10.5, y = 3.0;
        
        //1. Basic arithmetic operators +, -, x, /, %
        System.out.println("#".repeat(62));
        System.out.println("1. BASIC ARITHMETIC OPERATORS");
        System.out.println("#".repeat(62));
        System.out.printf("%-8s %-5s %-5s %-10s %-10s%n", "Op", "a=10", "b=3", "int Result", "double Result");
        System.out.printf("%-8s %-5d %-5d %-10s %-10.2f%n", "+", a, b, a + b, x + y);
    }
}
