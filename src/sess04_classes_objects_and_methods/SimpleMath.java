package sess04_classes_objects_and_methods;

/**
 * Class used to perform basic arithmetic operations like addition, subtraction,
 * multiplication, division, modulus and exponential
 * @author Administrator
 */
public class SimpleMath {
    /**
     * This method returns the sum of the two integers passed in.
     * 
     * @param num1 the first integer to be used in the addition.
     * @param num2 the second integer to be used in the addition.
     * 
     * @return an integer
     */
    public long addNums(int num1, int num2)
    {
        return num1 + num2;
    }
    
     /**
     * This method returns the difference of the two integers passed in.
     * 
     * @param num1 the first integer to be used in the subtraction.
     * @param num2 the second integer to be used in the subtraction.
     * 
     * @return the difference of the two integers as a long value
     */
    public int subtractNums(int num1, int num2)
    {
        return num1 - num2;
    }
    
     /**
     * This method returns the product of the two integers passed in.
     * 
     * @param num1 the first integer to be used in the multiplication.
     * @param num2 the second integer to be used in the multiplication.
     * 
     * @return the product of the two integers as a long value
     */
    public long multiplyNums(int num1, int num2)
    {
        return num1 * num2;
    }
    
    /**
     * This method returns the quotient of the two integers passed in.
     * 
     * @param num1 the first integer to be used in the division(Numerator).
     * @param num2 the second integer to be used in the division(Denominator).
     * 
     * @return the quotient of the two integers as a long value
     */
    public int divideNums(int num1, int num2)
    {
        if (num2 == 0)
        {
            System.err.println("Sorry, attempted to divide by '0' which will "
                    + "cause errors. \n Kindly use a non zero denominator");
            System.exit(num2);
        }
        return num1 / num2;
    }
    
    /**
     * This method returns the remainder/modulus of the two integers passed in.
     * 
     * @param num1 the first integer to be used in the modulus operation.
     * @param num2 the second integer to be used in the modulus operation.
     * 
     * @return the remainder/modulus of the two integers as a int value
     */
    public int getModulus(int num1, int num2)
    {
        return num1 % num2;
    }
    
    /**
     * This method returns the exponent of the two integers passed in.
     * 
     * @param num1 the first integer to be used as the base.
     * @param num2 the second integer to be used as the radix.
     * 
     * @return the exponent of the two integers as a float value
     */
    public float getExponent(int num1, int num2)
    {
        return (float)Math.pow(num1, num2);
    }
}
