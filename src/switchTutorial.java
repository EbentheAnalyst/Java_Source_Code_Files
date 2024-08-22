public class switchTutorial 
{
   public static void main(String[] args) 
   {
    int day = 4;// this stores the value 4 in the variable day that means it would alway print thursday which is case 4. You can use the Scanner class to rather take the user input so the user can type any number they want 
    switch (day) 
    {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
        
        default:
        System.out.println("Looking forward to the Weekend");

    }
    // Outputs "Thursday" (day 4)
    
    
    }
}
