package sess06_modifiers_and_packages;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Java program to demonstrate the 'transient' keyword/modifier to prevent users 
 * password from being serialized
 * @author Administrator
 */
public class TransientExample {
    // main method begins program execution
    public static void main(String[] args){
        // Create a user object
        User user1 = new User("Simakulu", "simakulu@example.com", "superSecret&Password");
        
        // Display the details of the user before serialization
        System.out.println("The user's details before serialization: \n" + user1);
        
        // serialize the user1 object to a file
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser")))
        {
            oos.writeObject(user1);
        }
        catch(IOExeption ioe)
        {
            System.err.println("The error: " + ioe.getLocalizedMessage() + " occured!");
        }
        
        // Modify the object by changing the user's password
        user1.password = "newPassWad";
        
        // Deserialize the object from the file
        try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream("user.ser")))
        {
            User deserialzedUser = (User) ios.readObject();
            
            // Display the details of the user after deserialization
            System.out.println("The User's details after deserialization: \n" + deserialzedUser);
        }
        catch(IOException | ClassNotFoundException e){
            System.err.println("The error: " + e.getLocalizedMessage() + " occured!");
        }
    }
}

class User implements Serializable{
    // Regular field, will be serialized
    String username, email;
    
    // Transient field, will NOT be serialized
    transient String password;
    
    // Parameterized constructor
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    // Overide the toString() method
    @Override
    public String toString()
    {
        return "User Details"
                + "\n"+"-".repeat(50)
                +"\nUsername: " + this.username
                +"\nEmail: " + this.email
                +"\nPassword: " + (this.password != null? "******":"null")
                +"\n"+"-".repeat(50);
    }
}
