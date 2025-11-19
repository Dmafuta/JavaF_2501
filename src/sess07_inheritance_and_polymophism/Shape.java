package sess07_inheritance_and_polymophism;

/**
 * The {@code Shape} class will be the super class of all shapes and it has a field 
 * name to hold the shape's name and an abstract method getName() that returns the 
 * name of the shape
 * @author Administrator
 */
public abstract class Shape {
    String name;
    
    public abstract String getName();
}
