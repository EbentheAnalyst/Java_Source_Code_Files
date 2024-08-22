import java.util.Scanner;
public class doWhileLoopSce 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int selection;
        
        do
        {
            System.out.println("Menu: ");
            System.out.println("1. Rice");
            System.out.println("2. Soup");
            System.out.println("3. Pasta");
            System.out.println("4. Done");
            System.out.println("Choose an option");
            selection = scanner.nextInt();

            switch(selection)
            {
                case 1 : System.out.println("Rice Selected");
                break;
                case 2 : System.out.println("Soup Selected");
                break;
                case 3 : System.out.println("Pasta Selected");
                break;
                case 4 : System.out.println("Thank you for coming");
                break;
                default : System.out.println("Invalid selection. Please try again!");
            }
        } 
        while (selection != 4);

        scanner.close();
    }    
}
