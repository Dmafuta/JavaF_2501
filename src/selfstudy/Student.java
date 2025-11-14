package selfstudy;

public class GFG{

    /**
     *
     */
    // Display the use of static key word in java
    static class Student {
        int rollNo;
        String name;

        // Static variable
        static String Training_center = "GFG";

        Student(int r, String n)
        {
            this.rollNo = r;
            this.name = n;
        }

        void display()
        {
            System.out.println(this.rollNo + " " + this.name + " " + Training_center);
        }
    }
}