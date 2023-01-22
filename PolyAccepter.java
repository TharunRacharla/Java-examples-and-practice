import java.io.*;
public class PolyAccepter
{
   static int horner(int poly[], int n, int x)
   { 
      int result = poly[0];
      for(int i=1;i<n;i++)
      {
         result = result*x + poly[i];
       }
      return result;
   }
   public static void main(String[] args)
   {
      PolyAccepter pa1 = new PolyAccepter();
      int[] poly = {2, -6, 2, -1};
      int x = 3;
      int n = poly.length;
      System.out.println("Value of polynomial is " + horner(poly,n,x));
   }
}