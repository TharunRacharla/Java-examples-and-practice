import java.util.Scanner;
public class Fibonacci
{
  public static void main(String[] args) 
  {
     System.out.println("Enter the number upto which fibonacci series is to be printed : ");
     int num = new Scanner(System.in).nextInt();
     System.out.println("Fibonacci series upto " + num +  " numbers :  ");
     for(int i = 1; i <= num; i++)
	{
	  System.out.print(fibonacci2(i) + "  ");
	}
  }
  public static int fibonacci3(int num)
  {
    if(num == 1 || num == 2)
    { return 1;}
    return fibonacci3(num-1) + fibonacci3(num - 2);
  }
   public static int fibonacci2(int num)
  { 
    if(num == 1 || num == 2)
    {return 1;}
     int fibo1 = 1, fibo2 = 1, fibonacci=1;
     for(int i = 3; i<= num; i++)
     {
       fibonacci = fibo1 + fibo2;
       fibo1 = fibo2;
       fibo2 = fibonacci;
     } 
    return fibonacci;
   }
} 