package sess07_inheritance_and_polymophism;

/**
 * The {@code cuboid} class represents a 3D rectangle with its length and width and breadth(depth). 
 * It provides methods to compare its surface area and volume
 * @author Administrator
 */
public class Cuboid extends Rectangle 
{
    // ===========================================
    // Instance fields
    // ===========================================
    /**
     * The breadth of the Cuboid ( in units )
     */
    private int breadth;
    
    // ============================================
    // Getters and Setters
    // ============================================
    /**
     * Returns the breadth of the cuboid (in units)
     * @return the breadth
     */
    public int getBreadth() {return breadth;}

    /**
     * @param breadth the breadth to set
     */
    public void setBreadth(int breadth) {this.breadth = breadth;}
    
    // ==============================================
    // Constructor
    // ==============================================
    public Cuboid(){
        super(); // Call the parent/super class constructor
        this.width = 0;
        this.name = "Cuboid"; // Change the name from rectangle to cuboid
    }
    public Cuboid(int length, int width, int breadth) {
        super(length, width);
        this.breadth = breadth;
        this.name = "Cuboid";
    }
    
    // ==============================================
    // Instance methods
    // ==============================================
    /**
     * Calculates and returns the Cuboid surface area (in square units)
     * @return the cuboid's area (in square units)
     */
    private long calcSurfaceArea() {
        return 2 * (this.calcArea() + width * breadth + breadth * length); // 2(lw + wb + lb)
    }

    private long calcVolume() {
        return calcArea() * breadth;}
       
    // ==============================================
    // Overridden methods
    // ==============================================
    @Override
    public String toString()
    {
        return this.getName() +" Details"
                + "\n" + "-".repeat(50)
                +"\n Length: " + this.length 
                +"\n Width: " + this.width
                +"\n Breadth: " + this.breadth
                +"\n Area: " + this.calcSurfaceArea()
                +"\n Length: " + this.calcVolume()
                + "\n" + "-".repeat(50);         
    }
}
