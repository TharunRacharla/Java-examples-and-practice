class MyThread1 implements Runnable 
{
 String name;
Thread t;
MyThread1(String thread)
{
    String threadname = "";
    name = threadname;
 t = new Thread(this, name );
System.out.println("New thread : " + t);
t.start();
}
public void run()
{
  try{
         for(int i = 5;i>0;i--)
         {
            System.out.println(name + ":" + i);
            Thread.sleep(500);
         }
       }
  catch(InterruptedException e)
      {
          System.out.println(name + "Interrupted");
   }
System.out.println(name + "existing");
}
}
class MultiThread3
{
 public static void main(String args[])
{
 new MyThread1("One");
 new MyThread1("Two");
 new MyThread1("Three");
 try
{
 Thread.sleep(500);
}
catch(InterruptedException e)
{
 System.out.println("main thread interrupted");
}
System.out.println("main thread existing");
}
}