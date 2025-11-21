package sess07_inheritance_and_polymophism;

public class Cylinder extends Circle{

    // Instance variable
    private int height;

    // Encapsulate properties
    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}

    // Instantiate the Constructor
    public Cylinder(){
        super(); // Calls parents class constructor
        this.height = 0;
        this.name = "Cuboid";
    }

    public Cylinder(float PI, int radius, int height ){
        super();
        this.radius = radius;
        this.height = height;
    }

    /**
     *
     * @return Area of the Cylinder
     */
    public float calcCylinderArea() {return (2 *(calcCircleArea()) + calcCirclePerimeter() * height);}

    /**
     *
     * @return volume of the Cylinder
     */
    public float volumeOfCylinder() {return calcCircleArea() * height;}

    @Override
    public String toString()
    {
        return getName() + " Details"
                + "\n"+"-".repeat(50)
                +"\n Radius: " + this.radius
                +"\n Height: " + this.height
                +"\n PI " + this.getPI()
                +"\n Area: " + this.calcCylinderArea()
                +"\n Volume: " + this.volumeOfCylinder()
                +"\n"+"-".repeat(50);
    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(22/7F,7,10);
        System.out.println(cyl);
    }
}
