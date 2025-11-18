package sess04_classes_objects_and_methods;

/**
 * Java class to model a student object.
 * @author Administrator
 */
public class Student {
    String studentID;
    String name;
    int age;
    char gender;
    
    // No argument constructor
    public Student()
    {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'F';                
    }
    
    // Student initializer
    public void initialiseStudent()
    {
        this.studentID = "Student0001";
        this.name = "Student one";
        this.age = 18;
    }
    // Method to display details
    public void displayDetails()
    {
        System.out.println("Student Details");
        System.out.println("-".repeat(50));
        System.out.println("Student's ID: " + this.studentID);
        System.out.println("Student's name: " + this.name);
        System.out.println("Student's age: " + this.age);
        System.out.println("Student gender" + (this.gender == 'm' || 
                this.gender == 'M'? "Male" : "Female"));
        System.out.println("-".repeat(50));
        
        
    }

    @Override
    public String toString() {
        return "Student Details\n" 
                + "-".repeat(50)
                + "\nStudent's ID: " + this.studentID
                + "\nStudent's name: " + this.name
                + "\nStudent's age: " + this.age
                + "\nStudent gender" + (this.gender == 'm' || 
                this.gender == 'M'? "Male\n" : "Female\n")
                + "-".repeat(50);
    }
}
