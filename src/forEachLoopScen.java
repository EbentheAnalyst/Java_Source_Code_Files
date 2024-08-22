public class forEachLoopScen
 {
    public static void main(String[] args) 
    {
        String [] customers = {"Amiri", "Jamol", "Charles", "Saburi", "Faraha", "Waris", "Ahmadi", "Eben"};
        for (String customer : customers)
        {
            System.out.println("Sending email to : " + customer);
        }
    }
}
