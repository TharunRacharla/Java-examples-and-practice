class X 
{
 public void methodX()
 {
  System.out.println("Classs X method");
 }
}
class Y extends X
{
  public void methodY()
 {
   System.out.println("class Y method");
 }
}
class Z extends Y
{
  public void methodZ()
  {
     System.out.println("class Z method");
  }
public static void main(String[] args)
{
  Z obj = new Z();
  obj.methodX(); // calling class grand parent method
  obj.methodY(); // calling parent class method
  obj.methodZ(); // calling local method
}
}