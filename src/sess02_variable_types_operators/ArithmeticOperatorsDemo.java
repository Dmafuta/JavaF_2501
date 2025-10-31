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
        int num1 = 10, num2 = 3;
        double num3 = 10.5, num4 = 3.0;
        
        // ==========================================================
        //1. Basic arithmetic operators +, -, x, /, %
        // ==========================================================
        System.out.println("#".repeat(62));
        System.out.println("1. BASIC ARITHMETIC OPERATORS");
        System.out.println("#".repeat(62));
        System.out.printf("%-24s %d + %d = %d" + "\n%-24s %.2f + %.2f = %.2f%n", 
                "Interger addition", num1, num2, num1 + num2, "Float addition", num3, num4, num3 + num4)
                
        // ==========================================================
        //2. Unary operators ++(Increment), --(Decrement)
        // ==========================================================
        System.out.println("=".repeat(62));
        System.out.println("2. UNARY INCREMENT & DECREMENT OPERATORS");
        System.out.println("=".repeat(62));
        
        System.out.println("Initial value of num1 is: " + num1);
        System.out.println("++num1 (Preincrement) = " (++num1)); // num1 incremented to 11 then returns 11
        System.out.println("num1 after preincrement is: " + num1);
        
        System.out.println("-".repeat(50));
        System.out.println("num1++ (Post-increment) = " (num1++)); // num1 incremented to 11 then returns 11
        System.out.println("num1 after preincrement is: " + num1);
        
        System.out.println("++num1 (Preincrement) = " (++num1)); // num1 incremented to 11 then returns 11
        System.out.println("num1 after preincrement is: " + num1);
        
        System.out.println("-".repeat(50));
        System.out.println("num1++ (Post-increment) = " (num1++)); // num1 decrements num1 to 10 then returns 10
        System.out.println("num1 after preincrement is: " + num1);
        
        // ==========================================================
        //3. Compound assignment operators +=, -=, *=, /=, %=
        // ==========================================================
        System.out.println("=".repeat(62));
        System.out.println("3. COMPOUND ASSIGNMENT OPERATORS");
        System.out.println("=".repeat(62));
        
        // Reassign and display the value of num2
        num2 = 20;
        System.out.println("Initial value of num2 is: " + num2);
        num2 += 5; // same as num2 = num2 + 5
        System.out.println("After +=5 num2 is: " + num2);
        num2 -= 3; // same as num2 = num2 + 3
        System.out.println("After -=3 num2 is: " + num2);
        num2 *= 2; // same as num2 = num2 x 2
        System.out.println("After x=2 num2 is: " + num2);
        num2 /= 4; // same as num2 = num2 / 4
        System.out.println("After /=4 num2 is: " + num2);
        num2 %= 2; // same as num2 = num2 % 2
        System.out.println("After %=2 num2 is: " + num2);
    }
}
