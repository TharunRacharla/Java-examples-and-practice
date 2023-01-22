import java.util.*;
public class Practical4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vector<String> Listitem = new Vector<>();
        int i,len;
        len = args.length;
        for(i=0;i<len;i++)
        {
            System.out.println("Enter "+i+ "th list item \n");
            String MyString = sc.next();
            Listitem.addElement(MyString);
        }
        //display
        System.out.println("\n Arguments entered by you is as under : \n");
        for(i=0;i<len;i++)
        {
            System.out.println("Argument "+(i+1)+" is "+args[i]);
        }
    }
}
