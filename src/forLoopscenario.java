public class forLoopscenario
{
     public static void main(String[] args) 
    
    {
        double [] prices = {12.99, 23.49, 5.99, 10.00, 7.89, 15.49, 22.50, 30.00, 18.75, 24.99};
        for (int number = 0; number < 10; number++)  
        {
            System.out.println("Price of item " + (number + 1) + " : $" + prices[number]);
        } 
    }
  
}
