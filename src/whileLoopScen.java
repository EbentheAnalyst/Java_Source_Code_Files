import java.util.Scanner;

public class whileLoopScen 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!command.equals("exit"))
        {
           System.out.print("Enter commnand:  ");
           command = scanner.nextLine();
           System.out.println("You entered: " + command);
        }
        System.out.println("Existing the Program");

        scanner.close();
    }
}
