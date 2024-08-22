import java.util.Scanner;
public class methodTutorial 
{      
    /*  public static void main(String[] args)
        {
            endClass();
            endClass();
            endClass();
            endClass();
            endClass();
            
        }

        static void endClass() 
        
        {
          System.out.println("Class has ended!");
        }

      }
      
      // Class has ended!"    */ 

      
      //This is another program that shows how to create a method
        // Create a checkAge() method with an integer variable called age
      
        static void checkAge(int age) 
        {
         // If age is less than 18, print "access denied"
          if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
      
          // If age is greater than, or equal to, 18, print "access granted"
          } 
          else 
          {
            System.out.println("Access granted - You are old enough!");
          }
      
        }
      
        public static void main(String[] args) 
        {
         Scanner scanner = new Scanner(System.in);
          System.out.println("Please enter your age: ");
          int age = scanner.nextInt();
          checkAge(age); // Call the checkAge method and pass along an age of 20
          scanner.close();
        }
}
 // Outputs "Access granted - You are old enough!"
      






