class ThreadName implements Runnable
{
    public void run()
{
 System.out.println(Thread.currentThread().getName() + "is running");
}
}
class Main
{
 public static void main(String args[])
{
 ThreadName obj = new ThreadName();
  Thread t1 = new Thread(obj);
  t1.setName("MyThread") ;
 System.out.println(t1.getName() + "is created!");
  t1.start(); 
}
}