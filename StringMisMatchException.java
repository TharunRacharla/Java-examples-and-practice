import java.util.Scanner;
class StringMisMatchException extends Exception
{
  public StringMisMatchException(String str)
  {
    System.out.println(str);
  }
}
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string ::");
 String input = sc.nextLine();

 try
 {
   if(input.equalsIgnoreCase("java"))
    System.out.println("String matched !!!");
   else
     throw new StringMisMatchException("String not matched ???");
 }
 catch(StringMisMatchException s)
 {
   System.out.println(s);
 }
}