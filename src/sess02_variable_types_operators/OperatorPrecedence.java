package sess02_variable_types_operators;

/**
 * Java program to demonstrate precedence among the various operators.
 * @author Administrator
 */
public class OperatorPrecedence {
    // main method begins program execution
    public static void main(String[] args) {
        // ===================================================================
        // 1. OPERATOR PRECEDENCE & EXPRESSION EVALUATION
        // ===================================================================
        System.out.println("1. OPERATOR PRECEDENCE EXAMPLE");
        System.out.println("-".repeat(50));
 
        int p = 8, q = 3, r = 2;
        double result = p + q * r / 2.0 - 1;
        // Step-by-step: (q * r) = 6 → 6 / 2.0 = 3.0 → p + 3.0 = 11.0 → 11.0 - 1 = 10.0
 
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
        System.out.println("Expression: p + q * r / 2.0 - 1");
        System.out.println("Step 1: q * r = " + (q * r));
        System.out.println("Step 2: " + (q * r) + " / 2.0 = " + ((q * r) / 2.0));
        System.out.println("Step 3: p + above = " + (p + (q * r) / 2.0));
        System.out.println("Step 4: final - 1 = " + result);
        System.out.println();
 
        // ===================================================================
        // 2. SPECIAL CASES: Division by Zero & Negative Modulus
        // ===================================================================
        System.out.println("2. SPECIAL CASES");
        System.out.println("-".repeat(50));
 
        System.out.println("Integer division by zero:");
        try {
            System.out.println("10 / 0 = ? → Throws ArithmeticException");
            int div = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("   Caught: " + e + "\n");
        }
 
        System.out.println("Floating-point division by zero:");
        double d1 = 10.0 / 0.0;
        double d2 = -10.0 / 0.0;
        double d3 = 0.0 / 0.0;
        System.out.printf(" 10.0 / 0.0  = %.2f (Infinity)%n", d1);
        System.out.printf("-10.0 / 0.0  = %.2f (-Infinity)%n", d2);
        System.out.printf("  0.0 / 0.0  = %.2f (NaN)%n%n", d3);
 
        System.out.println("Modulus with negative numbers:");
        System.out.println("-10 % 3  = " + (-10 % 3));   // Result: -1 (sign follows dividend)
        System.out.println("10 % -3  = " + (10 % -3));    // Result: 1
        System.out.println("-10 % -3 = " + (-10 % -3));   // Result: -1
        System.out.println();
    }
}
