package sess04_classes_objects_and_methods;

/**
 * Java program to demonstrate creating Student objects and invoking their methods
 * @author Administrator
 */
public class StudentDemo {
    // main method begins execution
    public static void main(String[] args) {
        Student s1 = new Student(); // Declare and instantiate a student object
        
        // Initialize the student object
        s1.initialiseStudent();
        
        // Display the student's details
        s1.displayDetails();
    }
    
}
