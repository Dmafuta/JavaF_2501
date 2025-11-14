package sess05_arrays_and_strings;

import java.util.ArrayList;
import sess04_classes_objects_and_methods.Person;

public class PersonArrayList {
    // Instance method to display persons details
    public void displayPerson(ArrayList<Person> pers)
    {
        System.out.println("The persons in the list are");
        System.out.printf("%-12s %-7s %-3s%n", "Name", "Gender", "Age");
        // use the for...each loop to display the individual person
        for (Person p : pers)
        {
            System.out.printf("%-12s %-7s %-3s%n", p.getName(),
                    (p.getGender() == 'M') ? "Male": "Female", p.getAge());
        }
        // Display the number of people in the person's arraylist
        System.out.println("The number of persons in the list is: " + pers.size());
    }

    // main method begins program execution
    public static void main(String[] args)
    {
        // create an ArrayList of persons
        ArrayList<Person> psn = new ArrayList<>();
        // create an object of the PersonArrayList
        PersonArrayList pal = new PersonArrayList();
        // Add persons to the psn ArrayList
        psn.add(new Person("John",'M',(byte)22));
        psn.add(new Person("Claire",'F',(byte)19));
        psn.add(new Person("Mary",'F',(byte)32));
        psn.add(new Person("Johnson",'M',(byte)44));
        psn.add(new Person("Joe",'M',(byte)25));
        psn.add(new Person("Sally",'F',(byte)21));

        // Display the persons added to the Person arraylist
        pal.displayPerson(psn);
        System.out.println("Adding two more persons...");
        psn.add(new Person("Sadik",'M',(byte)27));
        psn.add(new Person("Jane",'F',(byte)22));
        System.out.println("Displaying all persons in the list");
        pal.displayPerson(psn);

        // Add and remove a person from a specific index in the list
        psn.add(2, new Person("Arya", 'F',(byte)22));
        psn.remove(1); // remove claire
        System.out.println("After adding \"Arya\" and removing \"Claire\"");
        pal.displayPerson(psn);
    }
}
