public class nestedLooptut 
{
 public static void main(String[] args) 
 {

    // Outer loop
    /*for (int i = 1; i <= 2; i++) {
        System.out.println("Outer: " + i); // Executes 2 times
        
        // Inner loop
        for (int j = 1; j <= 3; j++) {
          System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        }*/
        
                // Outer loop for rows (multipliers)
                for (int i = 1; i <= 10; i++) 
                {
                    // Inner loop for columns (multiplicands)
                    for (int j = 1; j <= 10; j++) 
                    
                    {
                        // Print the product of i and j
                        System.out.print(i * j + "\t"); // '\t' adds a tab for spacing
                    }
                    // Print a new line after each row
                    System.out.println();
                }
            }
        
   
  } 
  

