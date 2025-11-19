package sess07_inheritance_and_polymophism;

public class Circle extends Shape{

    // Instance Variable specific for the circle
    protected final float PI = 22/7F;
    protected int radius;
    protected String name;

    /**
     * Returns the PI of the circle
     * @return the PI of the circle
     */
    public float getPI() {
        return PI;
    }

    /**
     * Returns the Radius of the circle
     * @return the radius of the circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the Radius of the circle
     * @param radius sets the Radius of the circle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Constructor
    public Circle(){
        this.radius = 0;
        this.name = "Circle";
    }

    public Circle(float PI, int radius )
    {
        this.radius = radius;
        this.name = "Circle";
    }

    // Instance Methods

    /**
     * Formulae to calculate the Area of the circle
     * @return the Area of the circle
     */
    public float calcCircleArea()
    {
        return PI * radius * radius;
    }

    /**
     * Formulae to calculate the Perimeter of the circle
     * @return the perimeter of the circle
     */
    public float calcCirclePerimeter()
    {
        return 2 * PI * radius;
    }

    @Override
    public String getName(){return this.name;}

    @Override
    public String toString()
    {
        return getName() + " Details"
            + "\n"+"-".repeat(50)
            +"\n Radius: " + this.radius
            +"\n PI " + this.getPI()
            +"\n Perimeter: " + this.calcCirclePerimeter()
            +"\n Area: " + this.calcCircleArea()
            +"\n"+"-".repeat(50);
    }

    public static void main(String[] args) {
        Circle cir = new Circle(22/7F, 5);
        System.out.println(cir);
    }
}
