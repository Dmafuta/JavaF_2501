package sess04_classes_objects_and_methods;

/**
 * A utility class demonstrating method overloading in Java
 * This class provides multiple versions of the addNums method that performs 
 * addition operations on different parameter list, showcasing the concept of 
 * method overloading (compile-time/static polymorphism)
 * @author Administrator
 */
public class MethodOverloading {
    /**
     * Adding two integers and returns their sum as a long
     * @param num1 the first integer to be added
     * @param num2 the second integer to be added
     * @return the sum of the two integers as a long value.
     */
    public long addNums(int num1, int num2)
    {
        return num1 + num2;
    }
    
    /**
     * Adding three integers and returns their sum as a long
     * @param num1 the first integer to be added
     * @param num2 the second integer to be added
     * @param num3 the third integer to be added
     * @return the sum of the three integers as a long value.
     */
    public long addNums(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
    
    /**
     * Adding a byte and an integer and returns their sum as a long
     * @param num1 the byte operand (automatically converted/promoted to int) 
     * @param num2 the second integer to be added
     * @return the sum of the byte and an integer as a long value.
     */
    public long addNums(byte num1, int num2)
    {
        return num1 + num2;
    }
    
    /**
     * Adds a variable number of integer arguments using Java's varargs feature
     * This method is the most flexible way to add numbers as it can handle any
     * number of arguments including zero
     * @param varargs a variable number of integers including ( 0 or more )
     * @return the sum of all provided integers as a long value
     */
    public long addNums(int ... varargs)
    {
        long sum = 0;
        for(int n: varargs)
            sum += n;
        return sum;
    }
}