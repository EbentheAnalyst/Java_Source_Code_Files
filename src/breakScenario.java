public class breakScenario 
{
public static void main(String[] args) 
{
    String [] boxes = {"Box1", "Box2", "Box3", "Box4", "Box5"};
    String targetBox = "Box3";

    for (int i = 0; i < boxes.length; i++)
    {
        if (boxes[i].equals(targetBox))
        {
            System.out.println("Found " + targetBox + " at postion " + i);
            break; //stop searching as soon as we find the target box
        }
    } 

}
   
}
