public class Numbering 
{
        public static void main(String[] args) throws Exception 
{
            //creating a string variable that combines two variables
            String firstName = "Eben ";
            String lastName = "Kwakye";
            String fullName = firstName + lastName;
            System.out.println(fullName);

            //creating an int variable that combines or add two variables
            int x = 15;
            int y = 62;
            System.out.println(x + y); // Print the value of x + y

            //You can assign same value to multiple variables on the same line 
            int a, b, c;
            a = b = c = 89;
            System.out.println(a + b + c);

            //So do the above instead of doing this
            int d = 89;
            int e = 89;
            int f = 89;
            System.out.println(d + e + f);

            //code showing that Java is case sensitive, the two variables below are not the same
            int TOTAL = 56;
            int total = 56;

            System.out.println(TOTAL + total);
                
           

}
    
}
