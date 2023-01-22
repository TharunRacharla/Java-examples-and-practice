class Color
{
 public void brown()
 {
  System.out.println("color brown");
 }
}
interface IFlyable
{
 void fly();
}
interface IEatable
{
 void eat();
}
// Bird class will implement interfaces and extend color class
class Bird extends Color implements IFlyable, IEatable
{
 //implement method of interfaces
  public void fly()
{
  System.out.println("Bird flies");
}
  public void eat()
  {
     System.out.println("bird eats");
//can have more than 2 methods.
  }
public static void main(String args[])
{
  Bird b = new Bird();
  b.eat();
  b.fly();
 b.brown();
}}