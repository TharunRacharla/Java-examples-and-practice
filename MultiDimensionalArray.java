public class MultiDimensionalArray
{
   public static void main(String[] args)
  {
     //create a 2d array
     int[][] a = {{1,2,3},{4,5,6,9},{7}};
     //calculate the array length
     System.out.println("Length of row 1  is : " + a[0].length);
     System.out.println("Length of row 2  is : " + a[1].length);
     System.out.println("Length of row 3  is : " + a[2].length);
    
     for(int i=0; i < a.length; ++i)//
     {
       for(int j = 0; j < a[i].length; ++j)
       {
           System.out.println(a[i][j]);
       }
     }
  }
}