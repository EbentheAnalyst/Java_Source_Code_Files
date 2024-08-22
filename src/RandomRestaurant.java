
//this program is also suppose to help suggest a restaurant for me to go
public class RandomRestaurant 
{
  public static void main(String[] args) 
  {
    //Creating an array to store the restaurant names 
    String [] restaurants = 
    {
        "Sushi Central",
        "Naan Kabab",
        "Bomyan Kabab",
        "Burger King",
        "Watan Kabab"
    };
    
    //Generate a random index to select a restaurant
    int randomRestaurantIndex = (int) (Math.random() * restaurants.length);

    //display on the screen the selected restaurant
    System.out.println("Good Morning, I hope you are feeling well today. For today, we will be eating at: " + restaurants[randomRestaurantIndex]);

  }
}
