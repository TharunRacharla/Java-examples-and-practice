public class OuterClassStaticExample
{
  int x=15;
  static double y = 178.5;
  
  static class StaticNestedClass
  {
    void show(OuterClassStaticExample outer)
     {
       System.out.println("\n The instance field, x, from OuterClass is" + outer.x);
       System.out.println("\n The static field , y, from OuterClass is" + y);
     }
  }
  public static void main(String args[])
  { 
     StaticNestedClass inner = new StaticNestedClass();
     OuterClassStaticExample outerStatic = new OuterClassStaticExample();
     inner.show(outerStatic);
  }
}