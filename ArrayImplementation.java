import java.util.Scanner;
public class ArrayImplementation
{
  public static void main(String[] args)
  {
   //OneDArray(10); 
        TwoDArray(5,5);
  }
  public static int OneDArray(int a)
  {
    int[] a1 = new int[a];
    int count = 1;
    for(int i = 0; i < a1.length ; i++)
    {
      a1[i] = count;
      count++;
    }
    for(int j = 0; j < a1.length ; j++)
    {
       System.out.print(a1[j] + "  ");
    }
   return 0;
  }
  public static int TwoDArray(int a, int b)
  {
    int[][] a1 = new int[a][b];
    int count = 1;
    for(int i = 0; i < a1.length; i++)
    {
      for(int j = 0; j < a1[i].length; j++)
      {
         a1[i][j] = count;
         count++;
      }
    }
for(int i = 0; i < a1.length; i++)
    {
      for(int j = 0; j < a1[i].length; j++)
      {
         System.out.print(a1[i][j] + "  ");
      }
         System.out.println();
    }
  return 0;
  }
}