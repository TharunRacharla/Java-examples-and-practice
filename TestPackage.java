//TestPackage.java
import p1.MyCalculator;
class TestPackage
{
  public static void main(String[] args)
  {
   MyCalculator M = new MyCalculator();
   System.out.println("/n/n/tFor two operand values 45 and 10 :");
   System.out.println("/n/n/t The sum is : " + M.Add(45,10));
   System.out.println("/n/n/t The Subtract is :" + M.Subtract(45,10));
   System.out.println("/n/n/t The Product is :" + M.Product(45,10));
  }
}