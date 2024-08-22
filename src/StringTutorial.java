public class StringTutorial 
{
     public static void main(String[] args)
    {
        //String greeting = "Hello";
        //System.out.println(greeting);

        // give me the solution to this code below (using narrowing casting techniques)
       /*  double myNumber = 10.5d;
        int myNumberUpdated = (int) myNumber;
        System.out.println(myNumber);
        System.out.println(myNumberUpdated);*/


        // give me the solution to this code below (using widening casting techniques)
       // char grade = 'A';
        //String gradeUpated = Character.toString(grade);
        //System.out.println(gradeUpated);

       
        //This is a string being converted into a char (Narowing Casting)
        /*String grade = "AB";
        char gradeUpdated = grade.charAt(0);
        System.out.println(grade);
        System.out.println(gradeUpdated);*/


// txt.length() helps you to count the lenght of your string or number of characters contained in your string
       // String myCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //System.out.println("The length of the myCharacters string is: " + myCharacters.length());

//This code below shows us how to convert to uppercase or lowercase in java
      //  String greeting = "Hello Class";
        //System.out.println(greeting.toUpperCase());   // Outputs "HELLO WORLD"
        //System.out.println(greeting.toLowerCase());   // Outputs "hello world“


 //this code make use of the indexof() method to find or locate a word in a string.
        //String myLocator = "We are now located in Toronto, Ontario, Canada!";
        //System.out.println(myLocator.indexOf("now"));

//this code combines two variables which are string.
        /*String firstName = "Eben";
          String lastName =  "Kwakye";
          System.out.println(firstName + " " + lastName);*/

//this code combines two variables which are string using the concat() method. Check the first variable and you will see there 
// is a space after the n in Eben
      /*     String firstName = "Eben";
          String lastName = " kwakye";
          System.out.println(firstName.concat(lastName));*/

//Java uses the + operator for both addition and concatenation. Numbers are added. Strings are concatenated.
/*int x = 30;
int y = 20;
int z = x + y;  // z will be 50 (an integer/number)

System.out.println(z);*/

/*If you add two strings, the result will be a string concatenation:
String x = "30";
String y = "20";
String z = x + y;  // z will be 3020 (a String)
System.out.println(z);*/

//this code will give you an error since it cant have double quotes within the text
//String txt = "We are the so-called "Gurus" from Stanford.";

//To fix the issue above, you add a backslash(/)
/*String txt= "We are the so-called \"Gurus\" from Stanford.";
System.out.println(txt);*/

//This code below shows you how to put a single quote in your text. The first one gives an error and the second one prints 
//what is needed on the screen.
//String txt = "It\'s alright.";  
//System.out.print(txt);

//String txt = "It\'s alright.";  
//System.out.print(txt);


    }
    
}
