public class Main1
{
 int x;
public Main1(int y,int z)
 {
   x=y*z;
}
   public static void main(String[] args)
{
  Main1 myObj  = new Main1(5,3);
System.out.println(myObj.x);
}
}