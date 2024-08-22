import java.util.Scanner;
public class felsestatement
{
    public static void main(String[] args) 
    {
        //this code uses the boolean data type
        /*boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false*/

        //this code below uses a boolean expression to check whether x is greater than y
        /*int x = 8;
        int y = 9;
        System.out.println(x > y); // this prints the result : it checks whether x is greater than y */

        //this code below uses a boolean expression to check whether x is the same as y
        /*int x = 10;
        int y = 10;
        System.out.println(x == y); // this prints  the result : it checks whether x is same as y */  
        
        //the code below is designed for a voting application to check whether the voter is 18 years or more to be eligible to vote

       /* int votingAge = 18 ;
        int myAge = 17;

        if (myAge >= votingAge)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote, Go home and come back when you are.");
        }*/

        //the code below make use of the else if statement
        /*int time = 22;
        if (time < 10) 
        {
         System.out.println("Good morning.");
        } 
        else if (time < 32) 
        {
         System.out.println("Good day.");
        } 
        else
         {
          System.out.println("Good evening.");
        } */

        Scanner scanner = new Scanner (System.in);

        //prompt the user to enter the door code
        System.out.println("Enter the door code");
        int doorCode = scanner.nextInt(); //this code allows the user to enter the door code

        if (doorCode == 1337) 
        {
          System.out.println("Correct code. The door is now open.");
        } 
        else
         {
          System.out.println("Wrong code. The door remains closed.");
        }

        scanner.close();
          
   }
    
}
