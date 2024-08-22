public class mathRandomQuotes 
{
    public static void main(String[] args)
    {
       /* The code below helps you to generate a random number between 0 and 100
        int randomNumber = (int)(Math.random() * 100);  // 0 to 100
        System.out.println(randomNumber); // print the answer that is stored in the variable called randomNumber */

        //This program is a Random Quote Display, whenever users open this application, it will give them a random quote of the day

        //first create an array to store your motivation quotes
        String [] motivationalQuotes = 
        {
            "The best way to predict the future is to invent it.",
            "You are never too old to set another goal or to dream a new dream.",
            "Life is 10% what happens to us and 90% how we react to it.",
            "The harder you work for something, the greater you will feel when you achieve it.",
            "The only way to do great work is to love what you do."
        };

        //Generate a randome index to select a quote
        //Math.random() return a double between 0 and 1.0
        //Multiply by motivationalQuotes.lenght to get a range from 0 to lenght -1
        int randomQuotes = (int)(Math.random() * motivationalQuotes.length);

        //Display the randomly selected quote on the screen

        System.out.println("Good morning, your Quote of the day is: " + motivationalQuotes[randomQuotes]);

    }    
}
