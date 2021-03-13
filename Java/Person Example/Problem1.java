/**
 * Use Class: Person
 * Features: cheap and tacky way of "Press 'Enter' key to continue..."
 */

public class Problem1
{
    public static void main(String[] args)
    {
        // Declarations
        Person objPerson1 = new Person("Chris", "Van", "Scott");
        Person objPerson2 = new Person("Fred", "Nicholas", "Smith");
        Person objPerson3 = new Person("John", "Will", "Locas");
        String sFullName;
        String sFirstName;
        String sMiddleName;
        String sLastName;


        // Initializations
        sFullName = objPerson1.toString();
        sFirstName = objPerson1.getFirstName();
        sMiddleName = objPerson1.getMiddleName();
        sLastName = objPerson1.getLastName();


        /* Output */
        // Print Full name + Each Part Of Name, Individually
        System.out.println("objPerson1 has been initialized, let's take a look at what we have.");
        System.out.println("Full Name: " + sFullName);
        System.out.println("First Name: " + sFirstName);
        System.out.println("Middle Name: " + sMiddleName);
        System.out.println("Last Name: " + sLastName);

        System.out.println();
        System.out.println();
        pressAnyKeyToContinue();
        System.out.println();


        // check if two objects contain the same first name and last name
        System.out.println("Let us compare if two different objects carry the same first and last name");
        System.out.println("I'll begin by displaying the contents of objPerson1 and objPerson2");
        System.out.println();

        System.out.print("objPerson1: ");
        objPerson1.print();

        System.out.print("objPerson2: ");
        objPerson2.print();

        System.out.println();
        System.out.print("Are they equal: ");
        System.out.println(objPerson1.equal(objPerson2));

        System.out.println();
        System.out.println();
        pressAnyKeyToContinue();
        System.out.println();


        // Test if First Name is Equal to Another name
        System.out.println("Let us compare if a given name is equal to objPerson1's first name");

        System.out.println("Compare \"Alex\"");
        System.out.println(objPerson1.isFirstNameEqual("Alex"));

        System.out.println("Compare \"Chris\"");
        System.out.println(objPerson1.isFirstNameEqual("Chris"));

        System.out.println();
        System.out.println();
        pressAnyKeyToContinue();
        System.out.println();


        // Check if middle name is equal to another name
        System.out.println("Let us compare if a given name is equal to objPerson1's middle name");

        System.out.println("Compare \"Van\"");
        System.out.println(objPerson1.isMiddleNameEqual("Van"));

        System.out.println("Compare \"Ray\"");
        System.out.println(objPerson1.isMiddleNameEqual("Ray"));

        System.out.println();
        System.out.println();
        pressAnyKeyToContinue();
        System.out.println();


        // Check if last name is equal to another name
        System.out.println("Let us compare if a given name is equal to objPerson1's last name");

        System.out.println("Compare \"Grant\"");
        System.out.println(objPerson1.isLastNameEqual("Grant"));

        System.out.println("Compare \"Scott\"");
        System.out.println(objPerson1.isLastNameEqual("Scott"));

        System.out.println();
        System.out.println();
        pressAnyKeyToContinue();
        System.out.println();


        // makeCopy();
        // objPerson2 will copy, and be replaced by, objPerson1's information
        System.out.println("I'm going to display objPerson1's & objPerson2's original contents");

        System.out.print("objPerson1: ");
        objPerson1.print();

        System.out.print("objPerson2: ");
        objPerson2.print();

        System.out.println();
        System.out.println("Using makeCopy(), I'm going to make a copy of objPerson1 for objPerson2 and display the results");
        objPerson2.makeCopy(objPerson1);

        System.out.print("objPerson1: ");
        objPerson1.print();

        System.out.print("objPerson2: ");
        objPerson2.print();

        System.out.println();
        System.out.println();
        pressAnyKeyToContinue();
        System.out.println();


        // getCopy();
        // objPerson3 will be equal to the returned value of objPerson2
        System.out.println("I'm going to display objPerson2's & objPerson3's original contents");

        System.out.print("objPerson2: ");
        objPerson2.print();

        System.out.print("objPerson3: ");
        objPerson3.print();

        System.out.println();
        System.out.println("Using getCopy(), I'm going to get a copy of objPerson2 for objPerson3 and display the results");
        objPerson3 = objPerson2.getCopy();

        System.out.print("objPerson2: ");
        objPerson2.print();

        System.out.print("objPerson3: ");
        objPerson3.print();
    }

    // Method
    public static void pressAnyKeyToContinue()
    {
        System.out.println("___________________________________________________________________________");
        System.out.println("Press 'Enter' key to continue...");
        System.out.println("___________________________________________________________________________");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
