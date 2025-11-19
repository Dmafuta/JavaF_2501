package sess07_inheritance_and_polymophism;

public class Cylinder extends Circle{

    // Instance variable
    private int height;

    // Encapsulate properties
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Instantiate the Constructor
    public Cylinder(){
        super(); // Calls parents class constructor
        this.height = 0;
        this.name = "Cuboid";
    }
}
