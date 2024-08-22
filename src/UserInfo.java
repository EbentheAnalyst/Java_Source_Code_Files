import java.util.Scanner;
public class UserInfo 
{
    public static void main(String[] args)
    {
        //create a Scanner object for the user input (opening the scanner)
        Scanner scanner = new Scanner (System.in);

        //prompt the user for thier name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); //this is the code that takes the name

         //prompt the user for thier age
         System.out.println("Enter your age: ");
         int age = scanner.nextInt(); //this is the code that takes the age

         //Display the result of the user on the screen
        System.out.println("\nUser Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        //close the scanner
        scanner.close();
    }

}
