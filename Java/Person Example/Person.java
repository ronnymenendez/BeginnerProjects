public class Person
{
    private String firstName; //store the first name
    private String lastName;  //store the last name
    private String middleName;

    //Default constructor
    //Initialize firstName and lastName to an empty string.
    public Person()
    {
        firstName = "";
        middleName = " ";
        lastName = "";

    }


    // Set firstName and lastName according to the parameters.
    public Person(String first, String middle, String last)
    {
        setName(first, middle, last);
    }


    // returns full name as String data type
    public String toString()
    {
        return (firstName + " " + middleName + " " + lastName);
    }


    // Sets name equal to parameters
    public void setName(String first, String middle, String last)
    {
        firstName = first;
        middleName = middle;
        lastName = last;
    }


    // set first name
    public void setFirstName(String first)
    {
        firstName = first;
    }


    // set middle name
    public void setMiddleName(String middle)
    {
        middleName = middle;
    }


    // set last name
    public void setLastName(String last)
    {
        lastName = last;
    }


    // check if given first name is equal to parameter
    public Boolean isFirstNameEqual(String first)
    {
        if (first.equals(firstName))
        {
            return true;
        }
        else
            return false;
    }


    // check if given middle name is equal to parameter
    public Boolean isMiddleNameEqual(String middle)
    {
        if (middle.equals(middleName))
        {
            return true;
        }
        else
            return false;
    }


    // check if given last name is equal to parameter
    public Boolean isLastNameEqual(String last)
    {
        if (last.equals(lastName))
        {
            return true;
        }
        else
            return false;
    }


    // check if two objects contain the same first and last name
    public Boolean equal(Person person2)
    {
        if(firstName.equals(person2.firstName) && lastName.equals(person2.lastName))
        {
            return true;
        }
        else
            return false;
    }


    // copies instance of variables of a 'Person' object
    // into another 'Person' object
    // ex: person1.makeCopy(person2); -> person1 now has the same info as person2
    public void makeCopy(Person otherPerson)
    {
        firstName = otherPerson.firstName;
        middleName = otherPerson.middleName;
        lastName = otherPerson.lastName;
    }


    // similar to makeCopy(), except it doesn't have parameters and it returns an object
    // ex: obj3 = obj1.getCopy(); -> obj3 now has the same info as obj1
    public Person getCopy()
    {
        Person temp = new Person();

        temp.firstName = firstName;
        temp.middleName = middleName;
        temp.lastName = lastName;

        return temp;
    }


    //Method to return firstName.
    public String getFirstName()
    {
        return firstName;
    }


    // Reurn middle name
    public String getMiddleName()
    {
        return middleName;
    }


    //Method to return lastName.
    public String getLastName()
    {
        return lastName;
    }


    // Prints full name
    public void print()
    {
        System.out.println(toString());
    }
}
