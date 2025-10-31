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
        System.out.println("\n");
        
        // variable to be used in the program
        int num1 = 10, num2 = 3;
        double num3 = 10.5, num4 = 3.0;
        
        // ==========================================================
        //1. Basic arithmetic operators +, -, x, /, %
        // ==========================================================
        System.out.println("=".repeat(62));
        System.out.println("1. BASIC ARITHMETIC OPERATORS");
        System.out.println("=".repeat(62));
        
        System.out.printf("%-24s %d + %d = %d" + "\n%-24s %.2f + %.2f = %.2f%n", "Interger addition", num1, num2, num1 + num2, "Float addition", num3, num4, num3 + num4);
        System.out.println("-".repeat(50));
        System.out.printf("%-24s %d - %d = %d" + "\n%-24s %.2f - %.2f = %.2f%n", "Interger subtraction", num1, num2, num1 - num2, "Float subtraction", num3, num4, num3 - num4);
        System.out.println("-".repeat(50));
        System.out.printf("%-24s %d x %d = %d" + "\n%-24s %.2f x %.2f = %.2f%n", "Interger multiplication", num1, num2, num1 * num2, "Float multiplication", num3, num4, num3 * num4);
        System.out.println("-".repeat(50));
        System.out.printf("%-24s %d / %d = %d" + "\n%-24s %.2f / %.2f = %.2f%n", "Interger division", num1, num2, num1 / num2, "Float division", num3, num4, num3 / num4);
        System.out.println("-".repeat(50));
        System.out.printf("%-24s %d %% %d = %d" + "\n%-24s %.2f %% %.2f = %.2f%n", "Interger modulus", num1, num2, num1 % num2, "Float modulus", num3, num4, num3 % num4);
        System.out.println("=".repeat(50));
        System.out.println("\n");
                
        // ==========================================================
        //2. Unary operators ++(Increment), --(Decrement)
        // ==========================================================
        System.out.println("=".repeat(62));
        System.out.println("2. UNARY INCREMENT & DECREMENT OPERATORS");
        System.out.println("=".repeat(62)); 
        
        System.out.println("Initial value of num1 is: " + num1);
        System.out.println("++num1 (Pre-increment) = " + (++num1)); // num1 incremented to 11 then returns 11
        System.out.println("num1 after pr-eincrement is: " + num1);
        System.out.println("-".repeat(50));
        System.out.println("num1++ (Post-increment) = "  + (num1++)); // num1 increment num1 to 1 then 
        System.out.println("num1 after preincrement is: " + num1);    // returns 12
        System.out.println("=".repeat(62));
        
        System.out.println("++num1 (Pre-decrement) = " + (--num1)); // num1 decremented to 11 then returns 11
        System.out.println("num1 after pre-decrement is: " + num1);
        System.out.println("-".repeat(50));
        System.out.println("num1++ (Post-decrement) = "  + (num1--)); // num1 decrements num1 to 10 then returns 10
        System.out.println("num1 after post-decrement is: " + num1);  // returns 10
        System.out.println("=".repeat(62));
        System.out.println("\n");
        
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
