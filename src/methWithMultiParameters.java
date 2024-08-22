// This program demonstrates a method that takes multiple parameters and prints a personalized message.

public class methWithMultiParameters 
{
    // Defines the main class named "methWithMultiParameters".

    static void fullName(String firstName, int age) 
    {
        // Defines a static void method named fullName that takes a string (firstName) and an integer (age) as parameters.

        System.out.println(firstName + " Johnson is " + age + " years old");
        // Prints the full name (with "Johnson" as the last name) and age of the person.
    }

    public static void main(String[] args) 
    {
        // Entry point of the Java application.

        fullName("Mary", 50);
        // Calls the fullName method with "Mary" as the first name and 50 as the age.

        fullName("Eben", 60);
        // Calls the fullName method with "Eben" as the first name and 60 as the age.

        fullName("Emma", 70);
        // Calls the fullName method with "Emma" as the first name and 70 as the age.
    }
    // End of the main method.
}
// End of the class.
