//this program is also suppose to help suggest a restaurant for me to go
public class RandomeName 
{
  public static void main(String[] args) 
  {
    //Creating an array to store the restaurant names 
    String [] Names = 
    {
        "Faraha",
        "Jamol",
        "Ahmadi",
        "Amiri",
        "Waris"
    };
    
    //Generate a random index to select a restaurant
    int randomNameIndex = (int) (Math.random() * Names.length); 

  
    //display on the screen the selected restaurant
    System.out.println("The person to present is : " + Names[randomNameIndex]);

  }
}
