public class Typecastingtutorial 
{
     public static void main(String[] args)
    {
        //this is about widening casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //this is narrowing casting
        double myScore = 9.78d;
        int myMainScore = (int) myScore; // Manual casting: double to int
    
        System.out.println(myScore);   // Outputs 9.78
        System.out.println(myMainScore);      // Outputs 9
    
  }
        
    
}
