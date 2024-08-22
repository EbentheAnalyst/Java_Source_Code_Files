/*this program prompts the user to enter their PIN and it will only continue to prompt them to enter their pin
 they have not yet entered a valid/correct pin */
import java.util.Scanner;
public class LoopATMPin
{
 public static void main(String[] args) 
 {
  /*Scanner scanner = new Scanner(System.in);
  String correctPin = "1234"; //This is the correct pin
  String enteredPin = "";

  //the while loop will check the condition before starting the loop
  while (!enteredPin.equals(correctPin))
  {
    System.out.println("Please enter your PIN: ");
    enteredPin = scanner.nextLine();

    if (!enteredPin.equals(correctPin))
    {
        System.out.println("Incorrect PIN. Try again. ");
    }

  }

    System.out.println("PIN accepted. Access granted. ");

    
    scanner.close(); */

//The code below shows how the do/while loop would also work
 Scanner scanner = new Scanner(System.in);
  String correctPin = "1234"; //This is the correct pin
  String enteredPin = "";
  

  do
  {
    System.out.println("Please enter your PIN: ");
    enteredPin = scanner.nextLine();

if(!enteredPin.equals(correctPin))
{
    System.out.println("Incorrect PIN. Try again");
}

  }

  while (!enteredPin.equals(correctPin));

  System.out.println("PIN accepted. Access granted");


  scanner.close();
 }

}
