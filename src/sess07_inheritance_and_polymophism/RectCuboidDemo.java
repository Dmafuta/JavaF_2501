package sess07_inheritance_and_polymophism;

/**
 * Java class to demonstrate creating Rectangle and cuboid object.
 * @author Administrator
 */
import java.util.Scanner;

public class RectCuboidDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the dimension of the rectangle
        System.out.println("Please enter the rectangle's length in cm: \n");
        int length = sc.nextInt();
        
        System.out.println("Please enter the rectangle's width in cm: \n");
        int width = sc.nextInt();
        
        // Declare and instance 
        Rectangle rect1 = new Rectangle(length, width);
        
        // Display
        System.out.println(rect1);
        
        // Declare the cuboid, then hard-code its values
        Cuboid cb1;
        cb1 = new Cuboid(8, 5, 2);
        
        //Display the cuboid dimensions
        System.out.println(cb1);
        
    }
}
