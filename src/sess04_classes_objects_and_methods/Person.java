package sess04_classes_objects_and_methods;

public class Person {
    // Instance Fields
    /**
     * The Person's Full Name
     */
    protected String name;
    /**
     * The Person's binary gender i.e. 'M' or 'm' for Male and
     * 'F' or 'f' for Female.
     */
    protected char gender;
    /**
     * The Person's age store as a {@code byte} to save memory since human
     * age is typically 0 to about 120 years
     */
    protected byte age;


    //============================================================
    //Constructors
    //============================================================
    /**
     * Default no-argument constructor that initializes a {@code Person}
     * object with default values
     */
    public Person()
    {
    }

    /**
     * Parameterized constructor to initialize a person's details to the
     * values passed in as parameters.
     *
     * @param name the person's full name
     * @param gender the person's gender: 'M'/'m' for male, 'F'/'f' for female
     * @param age the person's age in years (0 - 127)
     */
    public Person(String name, char gender, byte age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //============================================================
    //Getter and Setter methods
    //============================================================
    /**
     * Returns the name of the person
     *
     * @return the current value of {@code name}
     */
    public String getName()
    {
        return name;
    }

    /**
     * Updates or sets the person's name.
     *
     * @param name the new name of the person
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Returns the gender of the person ('M' or 'F').
     *
     * @return the current value of {@code gender}
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * Updates or sets the person's gender.
     *
     * @param gender the new gender of the person ('M' or 'F')
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    /**
     * Returns the age of the person in years
     *
     * @return the current value of {@code age}
     */
    public byte getAge()
    {
        return age;
    }

    /**
     * Updates or sets the person's age.
     *
     * @param age the new age of the person
     */
    public void setAge(byte age)
    {
        this.age = age;
    }

    //=========================================================
    //Overriden methods
    //=========================================================
    /**
     * Returns a formatted string representation of the {@code Person} object.
     *
     * @return a multi-line formatted string describing the person
     */
    @Override
    public String toString()
    {
        return "Person Details \n"
                + "-".repeat(50)
                + "\nPerson's Name: " + this.name
                + "\nPerson's age: " + this.age
                + "\nPerson's gender: " + (this.gender == 'm' || this.gender == 'M' ? "Male\n" : "Female\n")
                + "-".repeat(50);
    }
}
