public class TestExp
{
 public static void main(String args[])
  {
     doStuff();
   }
public static void doStuff()
  {
 try 
 {
   System.out.println(20/5);//1
 System.out.println(20/0);//2
 System.out.println(20/10);//3
 }    
catch(ArithmeticException e)
 {
     System.out.println(25/5);//4
 }
finally
{
System.out.println(25/5);
}
  System.out.println(30/0);//5
}
  
} 