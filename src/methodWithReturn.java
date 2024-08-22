public class voidAndMethodDiff 
{
    //this program is a greetings program
    //the firsr part shows how we use void with a method
    /*public static void greet(String firstName)
    {
        System.out.println("Hello " + firstName +  ", Welcome to the Java Class!");
    }

    public static void main(String[] args) 
    {
        //call the greet method to display a greeting message
        greet("Saburi");
        greet("Faraha");
        greet("Jamol");
        greet("Amiri");
        greet("Ahmadi");
        greet("Waris");
        greet("Eben");

    }*/

     public static String greet(String firstName)
     {
        return "Hello " + firstName + ", Welcome to the Java Class";
     }

     public static void main(String[] args) 
     {
        //cal the greet method, store the result and print it
        String greetingMessage1 = greet("Saburi");
        System.out.println(greetingMessage1);

        String greetingMessage2 = greet("Jamol");
        System.out.println(greetingMessage2);

        String greetingMessage3 = greet("Amiri");
        System.out.println(greetingMessage3);

        String greetingMessage4 = greet("Waris");
        System.out.println(greetingMessage4);

     }



}
