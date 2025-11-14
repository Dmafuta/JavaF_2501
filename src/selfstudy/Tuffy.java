package selfstudy;

// Self study for Object oriented programming. Materials from geeks for geeks
public class Tuffy {
    String name;
    String breed;
    byte age;
    String color;

    Tuffy(String n, String b, byte a, String c)
    {
        this.name = n;
        this.breed = b;
        this.age = a;
        this.color = c;
    }

    String showColor()
    {
        System.out.println("The color is: " + this.color);
        return null;
    }

    public static void main(String[] args) {
        Tuffy s1 = new Tuffy("Jane","male", (byte) 4,"green");
        System.out.printf(s1.showColor());
    }

}
