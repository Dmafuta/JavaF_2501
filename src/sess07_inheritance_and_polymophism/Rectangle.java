package sess07_inheritance_and_polymophism;

/**
 * The {} class represents a 2D rectangle with its length and width. It provides 
 * methods to compare its area and perimeter
 * @author Administrator
 */
public class Rectangle extends Shape{
    // ===========================================
    // Instance fields
    // ===========================================
    /**
     * The length of the Rectangle ( in units )
     */
    protected int length;
    /**
     * The width of the rectangle ( in units )
     */
    protected int width;
    protected String name;
    
    // ============================================
    // Getters and Setters
    // ============================================

    /**
     * Returns the length of the rectangle (in units)
     * @return the length
     */
    public int getLength() {return length;}

    /**
     * @param length the length to set
     */
    public void setLength(int length) {this.length = length;}

    /**
     * @return the width
     */
    public int getWidth() {return width;}

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {this.width = width;}
    
    // ==============================================
    // Constructor
    // ==============================================
    public Rectangle(){
        this.length = 0;
        this.width = 0;
        this.name = "Rectangle";
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }
    
    // ==============================================
    // Instance methods
    // ==============================================
    
    /**
     * Calculates and returns the rectangle's area (in square units)
     * @return 
     */
    public long calcArea() {return length * width;}

    public long calcPerimeter() {return 2* (length + width);}
       
    // ==============================================
    // Overriden methods
    // ==============================================
    @Override
    public String getName(){return this.name;}
    
    @Override
    public String toString()
    {
        return this.getName() +" Details"
                + "\n" + "-".repeat(50)
                +"\n Length: " + this.length 
                +"\n Width: " + this.width
                +"\n Area: " + this.calcArea()
                +"\n Length: " + this.calcPerimeter()
                + "\n" + "-".repeat(50);         
    }
}